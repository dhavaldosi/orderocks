package com.orderocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CheckOutPage extends BaseClass {

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//span[text()='Grocery']")
	WebElement grocery;

	@FindBy(css = "[id='CardholderName']")
	WebElement cardHolderName;

	@FindBy(css = "[id='CardNumber']")
	WebElement cardNumber;

	@FindBy(css = "[id='CardCode']")
	WebElement cardCode;

	@FindBy(css = "[class*='confirm-order']")
	WebElement confirm;

	@FindBy(css = "[id='ExpireMonth']")
	WebElement expireMonth;

	@FindBy(css = "[id='payment-info-buttons-container'] [value='Continue']")
	WebElement continuePaymentInfo;

	public WebElement expireMonth() {
		return expireMonth;
	}

	public WebElement continuePaymentInfo() {
		return continuePaymentInfo;
	}

	public WebElement cardHolderName() {
		return cardHolderName;
	}

	public WebElement cardNumber() {
		return cardNumber;
	}

	public WebElement cardCode() {
		return cardCode;
	}

	public WebElement confirmOrder() {
		return confirm;
	}

	public CheckOutPage enterCardHolderName() {
		type(cardHolderName, "Dhaval Dosi");
		return this;
	}

	public CheckOutPage enterCardNumber() {
		type(cardNumber, "5105575230210886");
		return this;
	}

	public CheckOutPage entercardCode() {
		type(cardCode, "123");
		return this;
	}

	public CheckOutPage selectExpireMonth() {
		waitForelement(expireMonth());
		Select expireMonth = new Select(expireMonth());
		expireMonth.selectByVisibleText("05");
		return this;
	}

	public CheckOutPage continuePaymentInformation() {
		clickOnElement(continuePaymentInfo());
		return this;
	}

	public CheckOutPage clickConfirmOrder() {
		clickOnElement(confirmOrder());
		return this;
	}

}
