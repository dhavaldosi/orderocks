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

import base.BaseClass;

public class VerfiyStore extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}



     @Test(description = "search and verify product with mythri")
    public void SearchProduct() {
    	 LoginPage login = new LoginPage(driver);
 		HomePage home = new HomePage(driver);
 		ThankYouPage thankyou = new ThankYouPage(driver);
 		CheckOutPage checkout = new CheckOutPage(driver);
 		login.clickLoginLink().provideCredentials().clickLoginButton();
	home.clickZipCodeButton().selectGrocery().getVendorList().selectShopFromList();
	;
      // Assert.assertEquals(home.getSearchField(), "search Mythri");
	//Assert.assertEquals(thankyou.getNameProduct(), "Amul Ghee/Tuppa, 1 L Pouch");
}


	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
