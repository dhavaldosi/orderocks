package com.orderocks.tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	@Test(description = "Process an order",priority=2)
	public void verifyCreateAnOder() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ThankYouPage thankyou = new ThankYouPage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink();
		login.email().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.clickLoginButton();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar()
				.searchProduct("DEEP FROZEN KESAR MANGO PULP 12OZ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(home.getproduct(),"DEEP FROZEN KESAR MANGO PULP 12OZ");
		home.clickSearchIcon().clickAddToCart().clickOnCart().clickCheckOut().continueBillingAddress()
				.selectSlotOfDelivery().continueShippingAddress();
		
		checkout.enterCardHolderName().enterCardNumber().selectExpireMonth().entercardCode()
				.continuePaymentInformation().clickConfirmOrder();
		Assert.assertEquals(thankyou.getOrderStatus(), "Your order has been successfully processed!");
	}
	
	@Test(description = "compare product", priority=1)
	public void verifyOderDetails() {LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	//ThankYouPage thankyou = new ThankYouPage(driver);
	//CheckOutPage checkout = new CheckOutPage(driver);
	login.clickLoginLink();
	login.email().sendKeys(prop.getProperty("username"));
	login.password().sendKeys(prop.getProperty("password"));
	login.clickLoginButton();
	home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar()
			.searchProduct("DEEP FROZEN KESAR MANGO PULP 12OZ");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Assert.assertEquals(home.getproduct(),"DEEP FROZEN KESAR MANGO PULP 12OZ");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
