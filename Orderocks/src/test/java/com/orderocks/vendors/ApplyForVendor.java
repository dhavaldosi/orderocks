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

public class ApplyForVendor extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}


	@Test(description = "Apply For Vendor Account")
	@Author("Pratibha Kumbhar")
    public void verifyApplyForVendoraccount() {
    	 LoginPage login = new LoginPage(driver);
  		HomePage home = new HomePage(driver);
  		 login.clickLoginLink().provideCredentials().clickLoginButton();
  		 home.clickOnApplyForVendorAccount().enterVendorName("Vendor A").clearExistingEmailaddress().enterVendorEmailAddress("vendora@gmail.com")
  		     .enterVendorDescription("We, Vendor A, supplies an Indian Snacks of rich quality").enterVendorContactNumber("012345678").enterVendorAddress("8660 S Quebec St, Lone Tree, CO 80124, United States").enterPickUpInstructions("Dasher Enter From Back Gate No. 37")
  		     .submitVendorApplication();
  		Assert.assertEquals(home.vendorApplicationResult(),
				"Your request has been submitted successfully. We'll contact you soon.");
	}
  		@AfterTest
		public void tearDown() {
			driver.close();

  
	}
}