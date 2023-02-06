package com.orderocks.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {

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
		sendKeys(cardHolderName, "Dhaval Dosi");
		return this;
	}

	public CheckOutPage enterCardNumber() {
		sendKeys(cardNumber, "5105575230210886");
		return this;
	}

	public CheckOutPage entercardCode() {
		sendKeys(cardCode, "123");
		return this;
	}

	public CheckOutPage selectExpireMonth() {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(expireMonth()));
		Select expireMonth = new Select(expireMonth());
		expireMonth.selectByVisibleText("05");
		return this;
	}
	
	public CheckOutPage continuePaymentInformation() {
		clickUsingJs(continuePaymentInfo());
		return this;
	}

	public CheckOutPage clickConfirmOrder() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(confirmOrder()));
		js.executeScript("arguments[0].click();", confirmOrder());
		return this;
	}

	public void sendKeys(WebElement locator, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);

	}

	public void click(WebElement locator) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
		locator.click();
	}
	
	public void clickUsingJs(WebElement locator) {
		try
		{
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
		locator.click();
		}
		catch(Exception e)
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(locator));
		js.executeScript("arguments[0].click();", locator);
		}
	}

}
