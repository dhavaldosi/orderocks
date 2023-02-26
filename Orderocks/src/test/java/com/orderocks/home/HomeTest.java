package com.orderocks.home;

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

public class HomeTest extends BaseClass {

	public static Logger log = LogManager.getLogger(HomeTest.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Twak chat agent message")
	@Author("Your Name")
	public void verifyTawk() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickTawkBubbleContainer();
		Assert.assertEquals(
				"Welcome to our site, if you need help simply reply to this message, we are online and ready to help.",
				home.clickPreviousButton());
	}
	
	
	
	@Test(description = "Verify successful login")
	@Author("Avantika")
	public void verifySuccessfulLogin() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		login.clickLoginButton();
		Assert.assertTrue(home.isWelComeMessagePresent());
		
	}
	
	@Test(description = "Verify header tabs are navigating to correct page")
	@Author("Your Name")
	public void verifyHeaderTabNavigation() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		login.clickLoginButton();
		home.clickManufacturers();
		Assert.assertEquals(home.getPageTitle(), "Manufacturer List");
		home.clickCustomerFeedBack();
		Assert.assertEquals(home.getPageTitle(), "Customer feedback/suggestions");
		home.clickVendorsAgreement();
		Assert.assertEquals(home.getPageTitle(), "Vendor Agreement");
		home.clickNewProducts();
		Assert.assertEquals(home.getPageTitle(), "New products");
		home.clickZipCodeVal();
		Assert.assertEquals(login.getTitle(), "Let's get you started");
	}
	
	@Test(description = "Verify all categories")
	@Author("Your Name")
	public void verifyAllCategories() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.hoverAllCategories().clickMilkProducts();
		Assert.assertEquals(home.getPageTitle(), "Milk Products");
		home.hoverAllCategories().clickDesserts();
		Assert.assertEquals(home.getPageTitle(), "Desserts");
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
