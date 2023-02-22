package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.CheckOutPage;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;
import com.orderocks.pages.ThankYouPage;

import base.BaseClass;

public class CancelOrder extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "CancelOrder")
	public void verifyCancelOrder() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ThankYouPage thankyou = new ThankYouPage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar()
				.searchProduct("DEEP FROZEN KESAR MANGO PULP 12OZ").clickSearchIcon().clickAddToCart().clickOnCart();
		checkout.clickCheckOut().continueBillingAddress().selectShippingMethod("Delivery").selectSlotOfDelivery().continueShippingAddress()
				.enterCardHolderName().enterCardNumber().selectExpireMonth().entercardCode()
				.continuePaymentInformation().clickConfirmOrder();
		thankyou.clickOrderDetails().clickCancelOrder().clickCancelthisOrder();
		
		Assert.assertEquals(thankyou.getOrderStatus(), "Your order has been cancel!");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
