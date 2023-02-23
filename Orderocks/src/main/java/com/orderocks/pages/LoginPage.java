package com.orderocks.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	

	public LoginPage clickLoginLink() {
		clickOnElement(loginLink);
		log.info("Clicked on login link.");
		return this;
	}

	public LoginPage clickLoginButton() {
		clickOnElement(loginButton);
		log.info("Clicked on login button.");
		return this;
	}
	
	public LoginPage provideCredentials() {
		email.sendKeys(prop.getProperty("username"));
		log.info("Entered user name.");
		password.sendKeys(prop.getProperty("password"));
		log.info("Entered password.");
		return this;
	}

	public String getTitle() {
		waitForelement(dialogTitle);
		log.info("Page title is : " +dialogTitle.getText());
		return dialogTitle.getText();
	}

}
