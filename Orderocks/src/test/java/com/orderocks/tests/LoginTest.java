package com.orderocks.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orderocks.pages.BaseClass;
import com.orderocks.pages.LoginPage;

public class LoginTest extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void verifyLogin() throws IOException {
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.getTitle(), "Let's get you started");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
