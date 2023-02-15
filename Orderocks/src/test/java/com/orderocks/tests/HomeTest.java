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

public class HomeTest extends BaseClass {

	public static Logger log = LogManager.getLogger(HomeTest.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Twak chat agent message")
	public void verifyTawk() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink();
//		login.email().sendKeys(prop.getProperty("username"));
//		login.password().sendKeys(prop.getProperty("password"));
//		login.clickLoginButton();
		home.clickTawkBubbleContainer();
		Assert.assertEquals(
				"Welcome to our site, if you need help simply reply to this message, we are online and ready to help.",
				home.getTawkAgentChat());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}