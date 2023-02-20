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



//Locators for verify tabs on Home Page

	@FindBy(xpath="//*[@class='mega-menu']//span[text()='Manufacturers']")
	WebElement manufacturers;
	
	@FindBy(xpath="//*[@class='mega-menu']//a[text()='Customer feedback/suggestions']")
	WebElement customerFeedbackSuggestions;
	
	@FindBy(xpath="//*[@class='mega-menu']//a[text()='Home page']")
	WebElement homePage;
	

	@FindBy(xpath="//*[@class='mega-menu']//span[text()='Store']")
	WebElement store;
	
	@FindBy(xpath="//*[@class='mega-menu']//a[text()='New products']")
	WebElement newProducts;
	
	@FindBy(xpath="//*[@class='mega-menu']//a[text()='Vendor Agreement']")
	WebElement vendorAgreement;
	
  @FindBy(xpath="//*[@class='mega-menu']//span[@id='ZipCodeVal']")
	WebElement zipCodeVal;
  
  @FindBy(xpath="//*[@class=\"page-title\"]")
  WebElement manufacturesText;
  
  @FindBy(xpath="//*[@id=\"ph-title\"]")
  WebElement customerfeedbackSuggessionText;
  
 //@FindBy(css="a[class='with-subcategories hover']")
 //WebElement withSubcategoriesHover;
	
 /////////////////////////////////////////////////////////////

	
	public LoginPage clickManufacturers(){
		clickOnElement(manufacturers);
		return this;
	}
	
		public LoginPage clickHomePage() {
		clickOnElement(homePage);
		return this;
		
		}
   public LoginPage clickCustomerFeedbackSuggestions() {
	     clickOnElement(customerFeedbackSuggestions);
			return this;
		}
	

	public LoginPage clickNewproducts(){
		clickOnElement(newProducts);
		return this;
	}
	
	public LoginPage clickZipCodeVal(){
		clickOnElement(zipCodeVal);
		return this;
	}
	
	public LoginPage clickVendorAgreement(){
		clickOnElement(vendorAgreement);
		return this;
	}
	
	
public String getManufacturesText() {
		waitForelement(manufacturesText);
		return manufacturesText.getText();
}	
	
	
	public String getcustomerfeedbackSuggessionText() {			
		waitForelement(customerfeedbackSuggessionText);
			return customerfeedbackSuggessionText.getText();
	
	}
	}
	
	
	



