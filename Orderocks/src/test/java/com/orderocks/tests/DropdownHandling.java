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

import base.Author;
import base.BaseClass;

public class DropdownHandling extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Select the Value from Dropdown")
	@Author("Your Name")
	public void selectDropdown() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickOnDropdown().selectByVisibleText();
        Assert.assertTrue(home.getCategoryList().contains("Amul"));

	}



	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
