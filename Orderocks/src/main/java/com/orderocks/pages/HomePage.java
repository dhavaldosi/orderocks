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

	@FindBy(xpath = "//a[text()='Hello, Automation Do not change']")
	WebElement welComeMessage;

	@FindBy(xpath = "//*[@class='mega-menu'] //span[text()='Manufacturers']")
	WebElement manufacturers;

	@FindBy(xpath = "//*[@class='mega-menu'] //a[text()='Home page']")
	WebElement homePage;

	@FindBy(xpath = "//*[@class='mega-menu'] //a[text()='Customer feedback/suggestions']")
	WebElement customerFeedBack;

	@FindBy(xpath = "//*[@class='mega-menu'] //a[text()='Vendor Agreement']")
	WebElement vendorsAgreement;

	@FindBy(xpath = "//*[@class='mega-menu'] //a[text()='New products']")
	WebElement newProducts;

	@FindBy(xpath = "//*[@class='mega-menu'] //span[text()='      Store   ']")
	WebElement store;

	@FindBy(css = "[class='mega-menu'] [id='ZipCodeVal']")
	WebElement zipCodeVal;

	@FindBy(css = "[class='page-title'] h1")
	WebElement pageTitle;

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
	
	@FindBy(xpath = "//div[text()='Discount codes and Vouchers']")
	WebElement discountCodesAndVouchers;

	@FindBy(css = "[id='giftcardcouponcode']")
	WebElement giftCardCouponCode;

	@FindBy(css = "[value='Add']")
	WebElement add;
	
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

	@FindBy(css = "div[id='vendor-banner-slider'] [class='slick-prev slick-arrow']")
	WebElement previousButton;

	@FindBy(xpath = "//*[@title='chat widget'][2]")
	WebElement tawkAutoMessageContainer;

	@FindBy(css = "svg[alt='Chat icon']")
	WebElement tawkBubbleContainer;

	@FindBy(css = "[class*='tawk-agent'] span")
	WebElement tawkAgent;
	
	@FindBy(css = "[class='category-navigation-title']")
	WebElement allCategories;
	
	@FindBy(xpath = "//ul[@id='ul-category-navigation']//a[text()='Milk Products']")
	WebElement milkProducts;
	
	@FindBy(xpath = "//ul[@id='ul-category-navigation']//a[text()='Desserts']")
	WebElement desserts;
	
	public HomePage hoverAllCategories() {
		hoverOnElement(allCategories);
		log.info("Hovered on categories.");
		return this;
	}
	
	public HomePage clickMilkProducts() {
		hoverAndClickOnElement(milkProducts);
		log.info("Clicked on mlik products.");
		return this;
	}
	
	public HomePage clickDesserts() {
		hoverAndClickOnElement(desserts);
		log.info("Clicked on Desserts.");
		return this;
	}

	public void enterValue() {
		addToCart.click();
	}

	public HomePage giftCardCouponCode () {
		clickOnElement(giftCardCouponCode);
		log.info("Clicked on gift Card Coupon Code.");
		return this;
	}

	public WebElement add() {
		return add;
	}
	
	public HomePage clickSearchBar() {
		clickOnElement(searchBar);
		log.info("Clicked on search Bar.");
		return this;
	}

	public HomePage clickManufacturers() {
		clickOnElement(manufacturers);
		log.info("Clicked on manufactureres.");
		return this;
	}

	public HomePage clickCustomerFeedBack() {
		clickOnElement(customerFeedBack);
		log.info("Clicked on customer FeedBack.");
		return this;
	}

	public HomePage clickVendorsAgreement() {
		clickOnElement(vendorsAgreement);
		log.info("Clicked on vendor Agreement.");
		return this;
	}

	public HomePage clickNewProducts() {
		clickOnElement(newProducts);
		log.info("Clicked on new Products.");
		return this;
	}

	public HomePage clickZipCodeVal() {
		clickOnElement(zipCodeVal);
		log.info("Clicked on zop COde.");
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
		log.info("Clicked on zip Code Button.");
		return this;
	}

	public HomePage clickPreviousButton() {
		hoverAndClickOnElement(previousButton);
		log.info("Clicked on privious Button.");
		return this;
	}

	public HomePage clickCart() {
		clickOnElement(cart);
		log.info("Clicked on cart.");
		return this;
	}

	public HomePage selectGrocery() {
		clickOnElement(grocery);
		log.info("Clicked on grocery.");
		return this;
	}

	public HomePage getVendorList() {
		clickOnElement(getVendor);
		log.info("Clicked on vendor");
		return this;
	}

	public HomePage clickSearchIcon() {
		clickOnElement(btnSearch);
		log.info("Clicked on search Icon.");
		return this;
	}

	public HomePage selectVendorFromList() {
		clickOnElement(selectVendor);
		log.info("Selected vendor from list.");
		return this;
	}

	public HomePage clickAddToCart() {
		clickOnElement(addToCart);
		log.info("Clicked on add to cart.");
		return this;
	}
	
	public HomePage selectDiscountCodesAndVouchers() {
		clickOnElement(discountCodesAndVouchers);
		log.info("Selected Discount Codes And Vouchers.");
		return this; 
	}

	public HomePage enterGiftCardCode() {
		type (giftCardCouponCode, "9c24c57c-803f");
		return this;
	}

	public HomePage ClickAdd() {
		clickOnElement (add);
		log.info("Clicked on add.");
		return this; 
	}

	public HomePage clickCheckOut() {
		clickOnElement(checkOut);
		log.info("Clicked on check Out.");
		return this;
	}

	public HomePage clickOnCart() {
		clickOnElement(cart);
		log.info("Clicked on cart.");
		return this;
	}

	public String getPageTitle() {
		return pageTitle.getText();
	}

	public boolean isWelComeMessagePresent() {
		return elementIsPresent(welComeMessage);
	}

	
}
