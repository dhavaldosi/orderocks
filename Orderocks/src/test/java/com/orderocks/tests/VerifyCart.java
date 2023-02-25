package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orderocks.pages.CheckOutPage;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;
import com.orderocks.pages.ThankYouPage;

import base.Author;
import base.BaseClass;

public class VerifyCart extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeMethod
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Product Added to Cart")
	@Author("Naresh")
	public void addToCart() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ThankYouPage thankyou = new ThankYouPage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList().clickSearchBar()
				.searchProduct("DEEP FROZEN KESAR MANGO PULP 12OZ").clickSearchIcon().clickAddToCart();
		driver.close();
	}

	@Test(description = "Verify Product Added to the Cart")
	public void verifyCart() {

		LoginPage login = new LoginPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		HomePage home = new HomePage(driver);
		home.clickOnCart();
		Assert.assertEquals(home.getProductName(), "DEEP FROZEN KESAR MANGO PULP 12OZ");
	}
}
