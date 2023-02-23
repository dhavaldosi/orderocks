package com.orderocks.tests;

import java.io.IOException;
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

import base.Author;
import base.BaseClass;

public class SelfCheckoutorder extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Process self checkout order")
	@Author("Your Name")
	public void verifySelfCheckoutOrder() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ThankYouPage thankyou = new ThankYouPage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
		home.clickZipCodeButton().clickRestaurant().getVendorList().selectpkDessertHome().clickSearchBar()
				.searchProduct("Cup cakes-Vanilla").clickSearchIcon().clickAddToCart().clickOnCart();
		checkout.clickCheckOut().continueBillingAddress().selectShippingMethod("Self Checkout").continueShippingAddress().enterCardHolderName()
		.enterCardNumber().selectExpireMonth().entercardCode().continuePaymentInformation().clickConfirmOrder();
		Assert.assertEquals(thankyou.getOrderStatus(), "Your order has been successfully processed!");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
