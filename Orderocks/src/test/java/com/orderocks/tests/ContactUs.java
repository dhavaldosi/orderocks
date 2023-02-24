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

import base.Author;
import base.BaseClass;

public class ContactUs extends BaseClass {

	public static Logger log = LogManager.getLogger(ContactUs.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Twak chat agent message")
	@Author("Avantika Tambekar")
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
	@Author("Your Name")
	public void verifyContactUs() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickContactUs();
	    Assert.assertEquals(home.getPageTitle(), "Contact Us");
	}
	
	
    @AfterTest
	public void tearDown() {
		driver.close();
	}

}