package com.orderocks.vendors;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;


import base.Author;
import base.BaseClass;

public class ReApplyForVendoraccount extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}


	@Test(description = "Re-Apply For Vendor Account")
	@Author("Pratibha Kumbhar")
    public void verifyNotableToApllyForvendoraccountWithSamecredentials() {
    	 LoginPage login = new LoginPage(driver);
  		HomePage home = new HomePage(driver);
  		 login.clickLoginLink().provideCredentials().clickLoginButton();
  		 
  		 home.clickOnApplyForVendorAccount().enterVendorName("Vendor A").clearExistingEmailaddress().enterVendorEmailAddress("vendora@gmail.com")
		     .enterVendorDescription("We, Vendor A, supplies an Indian Snacks of rich quality").enterVendorContactNumber("012345678").enterVendorAddress("8660 S Quebec St, Lone Tree, CO 80124, United States").enterPickUpInstructions("Dasher Enter From Back Gate No. 37")
		     .submitVendorApplication();
		Assert.assertEquals(home.vendorApplicationResult(),
			"Your request has been submitted successfully. We'll contact you soon.");
  		   home.clickOnApplyForVendorAccount();
  		   Assert.assertEquals(home.reApplyForVendorAccountResult(),
  					"You already applied for a vendor account. Please register as a new customer in order to apply for one more vendor account.");
	}
	@AfterTest
		public void tearDown() {
			driver.close();

  
	}
}