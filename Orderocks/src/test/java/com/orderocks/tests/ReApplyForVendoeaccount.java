package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;


import base.Author;
import base.BaseClass;

public class ReApplyForVendoeaccount extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}


	@Test(description = "Re-Apply For Vendor Account")
	@Author("Pratibha Kumbhar")
    public void verifyNotableToAPllyForvendoraccountWithSamecredentials() {
    	 LoginPage login = new LoginPage(driver);
  		HomePage home = new HomePage(driver);
  		 login.clickLoginLink().provideCredentials().clickLoginButton();
  		 home.clickOnApplyForVendorAccount().enterVendorName().clickOnenterVendorEmailaddress().clearExistingEmailaddress().enterVendorEmailaddress()
  		     .enterVendorDescription().enterVendorContactNumber().enterVendorAddress().enterPickUpInstructions()
  		     .submitVendorApplication().vendorApplicationResult();
  		     home.clickOnApplyForVendorAccount().reApplyForVendorAccountResult();
	}
  		@AfterTest
		public void tearDown() {
			driver.close();

  
	}
}