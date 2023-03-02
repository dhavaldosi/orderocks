package com.orderocks.cart;

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

public class CrossVendorProduct extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Unable To Add Another Vendor product")
	@Author("Pratibha Kumbhar")
	public void verifyUnableToAddAnotherVendorProduct() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
		home.clickZipCodeButton().clickRestaurant().getVendorList().selectpkDessertHome().clickSearchBar()
				.searchProduct("Cup cakes-Vanilla").clickSearchIcon().clickAddToCart().clickZipCodeButton()
				.selectGrocery().getVendorList().selectVendorFromList();
		Assert.assertEquals("Changing stores may remove items in the cart", getAlertText());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
