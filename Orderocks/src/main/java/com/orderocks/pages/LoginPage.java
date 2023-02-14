package com.orderocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

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

}
