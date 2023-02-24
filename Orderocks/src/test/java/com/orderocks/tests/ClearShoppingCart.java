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

import base.Author;
import base.BaseClass;

public class ClearShoppingCart extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Process with clear shopping cart")
	@Author("Avantika Tambekar")
	public void verifyClearShoppingCart() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar()
				.searchProduct("DEEP FROZEN KESAR MANGO PULP 12OZ").clickSearchIcon().clickAddToCart()
				.clickSearchBar().searchProduct("DEEP MASALA PARATHA")
			.clickSearchIcon().clickAddToCart().clickSearchBar().searchProduct("DEEP ELAICHI SHRIKHAND 14OZ/400G").clickSearchIcon()
			.clickAddToCart().clickOnCart().scrollToElementAndClickClearShoppingCart();
		Assert.assertEquals(home.getTitle(), "Your Shopping Cart is empty!");
	}


	@AfterTest
	public void tearDown() {
		driver.close();
	}
}