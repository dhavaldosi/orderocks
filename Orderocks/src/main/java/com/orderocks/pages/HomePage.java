package com.orderocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {

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
	
	@FindBy(xpath = "//a[text()=\"Angel_Market\"]")
	WebElement selectVendor2;

	@FindBy(css = "[id='small-searchterms']")
	WebElement searchBar;
	
	@FindBy(xpath = "//a[text()='Pepsi 2.25 L']")
	WebElement Product1;
	
	@FindBy(xpath = "//*[text()='DEEP FROZEN KESAR MANGO PULP 12OZ']")
	WebElement Product;
	
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

	@FindBy(xpath = "//*[@title='chat widget'][1]")
	WebElement tawkContainer;
	
	@FindBy(xpath = "//*[@title='chat widget'][2]")
	WebElement tawkAutoMessageContainer;

	@FindBy(css = "svg[alt='Chat icon']")
	WebElement tawkBubbleContainer;

	@FindBy(css = "[class*='tawk-agent'] span")
	WebElement tawkAgent;


	public WebElement tawkBubbleContainer() {
		return tawkBubbleContainer;
	}

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
	
	public String product() {
		return Product.getText();
	}
	public String getproduct() {
		waitForelement(Product);
		return Product.getText();
	}
	public String product2() {
		return Product1.getText();
	}
	public String getproduct2() {
		waitForelement(Product1);
		return Product1.getText();
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
		clickOnElement(searchBar);
		return this;
	}

	public HomePage clickTawkBubbleContainer() {
		waitForelement(tawkContainer);
		switchToIframe(tawkContainer);
		clickOnElement(tawkBubbleContainer);
		switchToDefault();
		return this;
	}

	public String getTawkAgentChat() {
		waitForelement(tawkAutoMessageContainer);
		switchToIframe(tawkAutoMessageContainer);
		waitForelement(tawkAgent);
		return tawkAgent.getText();

	}

	public HomePage searchProduct(String searchProduct) {
		type(searchBar, searchProduct);
		return this;
	}
	
	public HomePage clickZipCodeButton() {
		clickOnElement(zipCodeButton);
		return this;
	}

	public HomePage clickCart() {
		clickOnElement(cart);
		return this;
	}

	public HomePage selectGrocery() {
		clickOnElement(grocery);
		return this;
	}

	public HomePage getVendorList() {
		clickOnElement(getVendor);
		return this;
	}

	public HomePage clickSearchIcon() {
		clickOnElement(btnSearch);
		return this;
	}

	public HomePage selectVendorFromList() {
		clickOnElement(selectVendor);
		return this;
	}
	public HomePage selectVendorFromList1() {
		clickOnElement(selectVendor2);
		return this;
	}

	public HomePage selectSlotOfDelivery() {
		clickOnElement(selectSlot());
		return this;
	}

	public HomePage continueBillingAddress() {
		clickOnElement(continueBilling());
		return this;
	}

	public HomePage continueShippingAddress() {
		clickOnElement(continueShipping());
		return this;
	}

	public HomePage clickAddToCart() {
		clickOnElement(addToCart());
		return this;
	}

	public HomePage clickCheckOut() {
		clickOnElement(checkOut());
		return this;
	}

	public HomePage clickOnCart() {
		clickOnElement(cart());
		return this;
	}

}
