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

public class GivingReviewToProduct extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Giving reviews to the product")
	@Author("Your Name")
	public void EnterReviews() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		CheckOutPage checkout = new CheckOutPage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList()
				.searchProduct("DEEP ELAICHI SHRIKHAND 14OZ/400G");
		home.clickSearchIcon().clicktonProductTitle().clicktOnReviews().clicktonWriteReviews().enterReviewsTitle()
				.enterReviewsText().clickOnSubmitReviews();
		Assert.assertEquals(home.getSubmitMsg(),
				"You will see the product review after approving by a store administrator.");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
