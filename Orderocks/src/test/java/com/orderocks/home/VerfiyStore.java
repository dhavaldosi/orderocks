package com.orderocks.home;

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

public class VerfiyStore extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}


     @Test(description = "Search and verify product with mythri")
     @Author("Naresh")
    public void searchProduct() {
    	 LoginPage login = new LoginPage(driver);
 		HomePage home = new HomePage(driver);
 		CheckOutPage checkout = new CheckOutPage(driver);
 		login.clickLoginLink().provideCredentials().clickLoginButton();
 		checkout.clearCartIfProductAlreadyAdded();
	    home.clickZipCodeButton().selectGrocery().getVendorList().selectShopFromList();
	    Assert.assertEquals(home.getSearchBoxPlaceHolderValue(), "Search Mythri...");
}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
