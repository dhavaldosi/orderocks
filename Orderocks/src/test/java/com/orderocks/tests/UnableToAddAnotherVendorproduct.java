package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;

import base.BaseClass;

public class UnableToAddAnotherVendorproduct extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Unable To Add Another Vendor product")
	public void Verifyselfcheckoutorder() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickZipCodeButton().clickRestaurant().getVendorList().selectpkDessertHome().clickSearchBar()
				.searchProduct("Cup cakes-Vanilla").clickSearchIcon().clickAddToCart().clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList();	}
                  
	            //To Do- Method to get text from popup will be added
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
