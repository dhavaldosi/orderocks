package com.orderocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ThankYouPage extends BaseClass {

	public ThankYouPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(css = "[class='section order-completed'] [class='title'] strong")
	WebElement orderStatus;

	@FindBy(css = "[class='details-link'] a")
	WebElement orderDetails;
	
	@FindBy(css = "[class='product'] a")
	WebElement productName;

	public ThankYouPage clickConfirmOrder() {
		clickOnElement(orderDetails);
		return this;
	}
	
	public String getProductName() {
		return productName.getText();
	}

	public WebElement orderStatus() {
		return orderStatus;
	}

	public String getOrderStatus() {
		waitForelement(orderStatus);
		return orderStatus.getText();
	}
}
