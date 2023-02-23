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

public class CustomerAccountDetails extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Verify tabs in customer account details")
	public void verifyCustomerAccountDetailsTabs() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickAccountIcon().clickMyAccount();
		Assert.assertEquals(home.getPageTitle(), "My account - Customer info");
		home.selectMyAccountTab("Addresses");
		Assert.assertEquals(home.getPageTitle(), "My account - Addresses");
		home.selectMyAccountTab("Orders");
		Assert.assertEquals(home.getPageTitle(), "My account - Orders");
		home.selectMyAccountTab("Change password");
		Assert.assertEquals(home.getPageTitle(), "My account - Change password");
		home.selectMyAccountTab("My product reviews");
		Assert.assertEquals(home.getPageTitle(), "My account - My product reviews");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
