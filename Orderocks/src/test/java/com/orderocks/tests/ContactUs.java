package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;

import base.BaseClass;

public class ContactUs extends BaseClass {

	public static Logger log = LogManager.getLogger(ContactUs.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Twak chat agent message")
	public void verifyTawk() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickTawkBubbleContainer();
		Assert.assertEquals(
				"Welcome to our site, if you need help simply reply to this message, we are online and ready to help.",
				home.clickPreviousButton());
	}
	
	
	
	@Test(description = "verify contact us")
	public void verifycontactus() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		login.clickLoginButton();
	    home.scrollToElementAndClick().enterFullName().enterEmail().enterEnquiry().clickSubmit();
	    Assert.assertEquals(home.getPageTitle(), "Your enquiry has been successfully sent to the store owner.");
	}
	
	
    @AfterTest
	public void tearDown() {
		driver.close();
	}

}