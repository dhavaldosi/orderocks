package com.orderocks.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orderocks.pages.CheckOutPage;
import com.orderocks.pages.HomePage;
import com.orderocks.pages.LoginPage;
import com.orderocks.pages.ThankYouPage;

import base.BaseClass;

public class OutOfStockProduct extends BaseClass {

	private static final WebElement Store = null;
	public static Logger log = LogManager.getLogger(OutOfStockProduct.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initialzeDriver();
		log.info("Driver has initialized.");
	}
	
	@Test(description = "Out Of Stock without Login", priority=1)
	public void withoutLoginOutOfStock() {
		HomePage home = new HomePage(driver);
		home.clickRestaurant().clickZipCode().enterZipCode().clickZipCodeButton().getVendorList().selectpkDessertHome()
				.clickSearchBar().searchProduct("Vanilla Pastry").clickSearchIcon().clickAddToCart();
		Assert.assertEquals(home.getOutofstockText(), "Out of stock");

	}

	@Test(description = "Out Of Stock After Login", priority=2)

	public void outOfStockProduct() {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		driver.navigate().refresh();
		home.clickZipCodeToLogin();
		login.clickLoginLink();
		login.provideCredentials();
		login.clickLoginButton();
     	home.clickZipCodeButton().clickRestaurant().getVendorList().selectpkDessertHome().clickSearchBar().searchProduct("Vanilla Pastry").clickSearchIcon().clickAddToCart();
		Assert.assertEquals(home.getOutofstockText(), "Out of stock");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
