package com.orderocks.products;

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

public class ProductAddToCompareList extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}



	@Test(description = "Add product into compareList")
	@Author("Naresh")
    public void addToCompareList() {
    	 LoginPage login = new LoginPage(driver);
  		HomePage home = new HomePage(driver);
  		ThankYouPage thankyou = new ThankYouPage(driver);
  		CheckOutPage checkout = new CheckOutPage(driver);
  		login.clickLoginLink().provideCredentials().clickLoginButton();
		checkout.clearCartIfProductAlreadyAdded();
 	    home.clickZipCodeButton().selectGrocery().getVendorList().selectShopFromList().searchProduct("Amul Amul Masti Dahi Cup - 400 Gm");
	     home.clickSearchIcon().clickComparelistIcon().clickCompareList();
	     Assert.assertEquals(home.getcompareList(), "Amul Amul Masti Dahi Cup - 400 Gm");
        
	     
	    // Assert.assertTrue(home.getcompareList().contains("Amul"));
     }



	/*@AfterTest
	public void tearDown() {
		driver.close();
	}*/
}
