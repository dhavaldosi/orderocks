package com.orderocks.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//*[@class='auth']/a")
	WebElement loginLink;

	@FindBy(css = "[id='Email']")
	WebElement email;

	@FindBy(css = "[id='Password']")
	WebElement password;

	@FindBy(xpath = "//*[@value='Log in']")
	WebElement loginButton;

	@FindBy(css = "[class='ui-dialog-title']")
	WebElement dialogTitle;

	public WebElement dialogTitle() {
		return dialogTitle;
	}

	public WebElement loginLink() {
		return loginLink;
	}

	public WebElement email() {
		return email;
	}

	public WebElement password() {
		return password;
	}

	public LoginPage clickLoginLink() {
		click(loginLink);
		return this;
	}

	public LoginPage clickLoginButton() {
		click(loginButton);
		return this;
	}

	public String getTitle() {
		waitForelement(dialogTitle);
		return dialogTitle.getText();
	}

	public void sendKeys(WebElement locator, String value) {
		waitForelement(locator);
		locator.sendKeys(value);
	}

	public void click(WebElement locator) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
			locator.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(locator));
			js.executeScript("arguments[0].click();", locator);
		}
	}

	public void waitForelement(WebElement locator) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
		locator.click();
	}

}
