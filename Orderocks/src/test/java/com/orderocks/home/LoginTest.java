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

public class LoginTest extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Login popup title")
	@Author("Your Name")
	public void verifyLogin() throws IOException {
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.getTitle(), "Let's get you started");
	}
	
	@Test(description = "Verify logout")
	@Author("Your Name")
	public void verifyLogOut() throws IOException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickAccountIcon().clickLogOut();
		Assert.assertEquals(login.getTitle(), "Let's get you started");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
