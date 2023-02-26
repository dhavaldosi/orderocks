package com.orderocks.products;

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

public class ProductSearch extends BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}

	@Test(description = "Search product")
	@Author("Shrinivas Thorate")
	public void verifySearchProduct() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.clickLoginLink().provideCredentials().clickLoginButton();
		home.clickZipCodeButton().selectGrocery().getVendorList().selectVendorFromList2().clickSearchBar()
				.searchProduct("Pepsi 2.25 L").clickSearchIcon();
		Assert.assertEquals(home.getproduct2(),"Pepsi 2.25 L");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
