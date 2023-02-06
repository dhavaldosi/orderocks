package com.orderocks.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//span[text()='Grocery']")
	WebElement grocery;

	@FindBy(css = "[id='set-zipcode-button']")
	WebElement zipCodeButton;

	@FindBy(css = "[id='getvendor']")
	WebElement getVendor;

	@FindBy(xpath = "//a[text()='Konark Groceries']")
	WebElement selectVendor;

	@FindBy(css = "[id='small-searchterms']")
	WebElement searchBar;

	@FindBy(css = "[id='btnSearch']")
	WebElement btnSearch;

	@FindBy(xpath = "//input[@value='Add to cart']")
	WebElement addToCart;

	@FindBy(css = "[class='cart-qty']")
	WebElement cart;

	@FindBy(css = "[id='checkout']")
	WebElement checkOut;

	@FindBy(css = "[title='Continue']")
	WebElement continueBilling;

	@FindBy(css = "[id='shipping-buttons-container'] [title='Continue']")
	WebElement continueShipping;

	@FindBy(css = "[id='payment-info-buttons-container'] [value='Continue']")
	WebElement continuePaymentInfo;

	@FindBy(xpath = "//*[starts-with(@id,'delivery_slot_body')and not(contains(@style,'display'))]/ul/li[2]/span/label")
	WebElement pmSlot;

	public WebElement selectSlot() {
		return pmSlot;
	}

	public WebElement continueBilling() {
		return continueBilling;
	}

	public WebElement continuePaymentInfo() {
		return continuePaymentInfo;
	}

	public WebElement continueShipping() {
		return continueShipping;
	}

	public WebElement checkOut() {
		return checkOut;
	}

	public WebElement grocery() {
		return grocery;
	}

	public WebElement getVendor() {
		return getVendor;
	}

	public WebElement selectVendor() {
		return selectVendor;
	}

	public WebElement searchBar() {
		return searchBar;
	}

	public WebElement zipCodeButton() {
		return zipCodeButton;
	}

	public WebElement btnSearch() {
		return btnSearch;
	}

	public WebElement addToCart() {
		return addToCart;
	}

	public WebElement cart() {
		return cart;
	}

	public void enterValue() {
		addToCart().click();
	}
	
	public HomePage clickSearchBar() {
		click(searchBar);
		return this;
	}
	

	public HomePage clickZipCodeButton() {
		click(zipCodeButton);
		return this;
	}

	public HomePage clickCart() {
		click(cart);
		return this;
	}

	public HomePage selectGrocery() {
		click(grocery);
		return this;
	}

	public HomePage getVendorList() {
		click(getVendor);
		return this;
	}
	
	
	public HomePage clickBtnSearch() {
		click(btnSearch);
		return this;
	}
	
	public HomePage selectVendorFromList() {
		click(selectVendor);
		return this;
	}

	public HomePage selectSlotOfDelivery() {
		click(selectSlot());
		return this;
	}

	public HomePage continueBillingAddress() {
		click(continueBilling());
		return this;
	}

	public HomePage continueShippingAddress() {
		click(continueShipping());
		return this;
	}
	
	

	public HomePage clickAddToCart() {
		click(addToCart());
		return this;
	}

	public HomePage clickCheckOut() {
		click(checkOut());
		return this;
	}

	public HomePage clickOnCart() {
		click(cart());
		return this;
	}

	public void sendKeys(WebElement locator, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
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

}
