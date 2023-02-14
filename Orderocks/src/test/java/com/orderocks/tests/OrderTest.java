package com.orderocks.tests;

import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.CheckOutPage;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;
import com.orderocks.pages.ThankYouPage;

import base.BaseClass;

public class OrderTest extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test
	public void verifyCreateAnOder() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ThankYouPage thankyou = new ThankYouPage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink();
		login.email().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.clickLoginButton();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar();
		sendKeys(driver, home.searchBar(), "DEEP FROZEN KESAR MANGO PULP 12OZ");
		home.clickBtnSearch().clickAddToCart().clickOnCart().clickCheckOut().continueBillingAddress()
				.selectSlotOfDelivery().continueShippingAddress();
		checkout.enterCardHolderName().enterCardNumber().selectExpireMonth().entercardCode()
				.continuePaymentInformation().clickConfirmOrder();
		Assert.assertEquals(thankyou.getOrderStatus(), "Your order has been successfully processed!");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	public static void sendKeys(WebDriver driver, WebElement locator, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}
}
