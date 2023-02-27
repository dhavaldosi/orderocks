package com.orderocks.account;

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

public class CustomerAccountDetails extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Verify tabs in customer account details")
	@Author("Naresh")
	public void verifyCustomerAccountDetailsTabs() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickAccountIcon().clickMyAccount();
		home.selectMyAccountTab("CUSTOMER INFO");
		Assert.assertEquals(home.getPageTitle(), "My account - Customer info");
		home.selectMyAccountTab("ADDRESSES");
		Assert.assertEquals(home.getPageTitle(), "My account - Addresses");
		home.selectMyAccountTab("ORDERS");
		Assert.assertEquals(home.getPageTitle(), "My account - Orders");
		home.selectMyAccountTab("RETURN REQUESTS");
		Assert.assertEquals(home.getPageTitle(), "My account - Return requests");
		home.selectMyAccountTab("CHANGE PASSWORD");
		Assert.assertEquals(home.getPageTitle(), "My account - Change password");
		home.selectMyAccountTab("MY PRODUCT REVIEWS");
		Assert.assertEquals(home.getPageTitle(), "My account - My product reviews");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
