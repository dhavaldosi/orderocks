package com.orderocks.vendors;

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
	

	public class ApplyForReturnRequest extends BaseClass {

		public static Logger log = LogManager.getLogger(BaseClass.class.getName());

		@BeforeTest
		public void initialze() throws IOException {
			driver = initialzeDriver();
			log.info("Driver has initialized.");
		}

		@Test(description = "My account reviews")
		@Author("Shrinivas Thorate")
		public void verifyReviews() {
			LoginPage login = new LoginPage(driver);
			HomePage home = new HomePage(driver);
			CheckOutPage checkout = new CheckOutPage(driver);
			login.clickLoginLink().provideCredentials().clickLoginButton();
			home.clickOnMyAccount().clicktonMyAccountIcon().clicktonOrderTitle().clicktonReturnItem().
			clicktonQuntityReturnRequest().selectByVisibleText2().clicktonSubmitReturnRequest();
			Assert.assertEquals(home.getVerifyReturnMsg(), "Return item(s) from order #1687");
		}

		@AfterTest
		public void tearDown() {
			driver.close();
		}
	}
	