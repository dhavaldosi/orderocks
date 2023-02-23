package com.orderocks.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CheckOutPage extends BaseClass {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(css = "[id='CardholderName']")
	WebElement cardHolderName;

	@FindBy(css = "[id='CardNumber']")
	WebElement cardNumber;

	@FindBy(css = "[id='CardNumber']")
	WebElement demo;

	@FindBy(css = "[id='CardCode']")
	WebElement cardCode;

	@FindBy(css = "[class='gender'] li label")
	List<WebElement> shippingMethod;

	@FindBy(css = "[class*='confirm-order']")
	WebElement confirm;

	@FindBy(css = "[id='ExpireMonth']")
	WebElement expireMonth;

	@FindBy(css = "[id='payment-info-buttons-container'] [value='Continue']")
	WebElement continuePaymentInfo;

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
	
	@FindBy(xpath = "//span[text()='Clear shopping cart']")
	WebElement clearShoppingCart;
	
	@FindBy(css = "[class='header-logo'] a")
	WebElement headerLogo;

	@FindBy(css = "[class='cart-qty']")
	WebElement cart;

	@FindBy(css = "[id='checkout']")
	WebElement checkOut;

	@FindBy(css = "[title='Continue']")
	WebElement continueBilling;

	@FindBy(css = "[id='shipping-buttons-container'] [title='Continue']")
	WebElement continueShipping;

	@FindBy(xpath = "//*[starts-with(@id,'delivery_slot_body')and not(contains(@style,'display'))]/ul/li[2]/span/label")
	WebElement pmSlot;

	@FindBy(css = "[class='cart-qty']")
	WebElement cartQty;
	
	@FindBy(css = " [class='shipping-cost']")
	WebElement shippingcost;

	@FindBy(xpath = " [@id=\"shopping-cart-form\"][1]")
	WebElement shoppingCartFrom;

	public CheckOutPage clickSearchBar() {
		clickOnElement(searchBar);
		log.info("Clicked on search bar.");
		return this;
	}

	public CheckOutPage clickManufacturers() {
		clickOnElement(manufacturers);
		log.info("Clicked on manufacturees.");
		return this;
	}

	public CheckOutPage clickCustomerFeedBack() {
		clickOnElement(customerFeedBack);
		log.info("Clicked on customer feedback.");
		return this;
	}

	public CheckOutPage clickVendorsAgreement() {
		clickOnElement(vendorsAgreement);
		log.info("Clicked on vendors agreement.");
		return this;
	}

	public CheckOutPage clickNewProducts() {
		clickOnElement(newProducts);
		log.info("Clicked on new products.");
		return this;
	}

	public CheckOutPage clickZipCodeVal() {
		clickOnElement(zipCodeVal);
		log.info("Clicked on zip code value.");
		return this;
	}

	public CheckOutPage searchProduct(String searchProduct) {
		type(searchBar, searchProduct);
		log.info("Clicked on search product.");
		return this;
	}

	public CheckOutPage clickZipCodeButton() {
		clickOnElement(zipCodeButton);
		log.info("Clicked on zip code button.");
		return this;
	}

	public CheckOutPage clickCart() {
		clickOnElement(cart);
		log.info("Clicked on cart.");
		return this;
	}

	public CheckOutPage selectGrocery() {
		clickOnElement(grocery);
		log.info("Clicked on grocery.");
		return this;
	}

	public CheckOutPage getVendorList() {
		clickOnElement(getVendor);
		log.info("Selected the vendor.");
		return this;
	}

	public CheckOutPage clickSearchIcon() {
		clickOnElement(btnSearch);
		log.info("Clicked search button.");
		return this;
	}

	public CheckOutPage selectVendorFromList() {
		clickOnElement(selectVendor);
		log.info("Selected vendor.");
		return this;
	}

	public CheckOutPage selectSlotOfDelivery() {
		clickOnElement(pmSlot);
		log.info("Selected delivery slot.");
		return this;
	}

	public CheckOutPage continueBillingAddress() {
		clickOnElement(continueBilling);
		log.info("Clicked on continue button of billing section");
		return this;
	}

	public CheckOutPage continueShippingAddress() {
		clickOnElement(continueShipping);
		log.info("Clicked on continue button of shipping section.");
		return this;
	}

	public CheckOutPage clickAddToCart() {
		clickOnElement(addToCart);
		log.info("Clicked on add to cart.");
		return this;
	}

	public CheckOutPage clickCheckOut() {
		clickOnElement(checkOut);
		log.info("Clicked on checkout");
		return this;
	}

	public CheckOutPage clickOnCart() {
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

	public CheckOutPage enterCardHolderName() {
		type(cardHolderName, "Dhaval Dosi");
		return this;
	}

	public CheckOutPage clickDemo() {
		clickOnElement(demo);
		return this;
	}

	public CheckOutPage enterCardNumber() {
		type(cardNumber, "5105575230210886");
		return this;
	}

	public CheckOutPage entercardCode() {
		type(cardCode, "123");
		log.info("Entered card code.");
		return this;
	}

	public CheckOutPage selectExpireMonth() {
		waitForelement(expireMonth);
		Select expireMon = new Select(expireMonth);
		expireMon.selectByVisibleText("05");
		log.info("Provided expiry month.");
		return this;
	}

	public CheckOutPage continuePaymentInformation() {
		clickOnElement(continuePaymentInfo);
		log.info("Clicked on continue payment information");
		return this;
	}
	
	public String getShippingcost() {
		waitForelement(shippingcost);
		return shippingcost.getText();
}

	public String getshoppingCartFrom() {
		waitForelement(shoppingCartFrom);
		return shoppingCartFrom.getText();

	}
	

	public CheckOutPage clickConfirmOrder() {
		clickOnElement(confirm);
		log.info("Clicked on confirm order.");
		return this;
	}

	public CheckOutPage selectShippingMethod(String selectShippingMethod) {

		for (int i = 0; i < shippingMethod.size(); i++) {
			if (shippingMethod.get(i).getText().equals(selectShippingMethod)) {
				shippingMethod.get(i).click();
				log.info("Selected shipping method : " +selectShippingMethod);
				break;
			}
		}

		return this;
	}
	
	public CheckOutPage clearCartIfProductAlreadyAdded() {
		if (!cartQty.getText().equals("0")) {
			clickOnElement(cart);
			clickOnElement(clearShoppingCart);
			clickOnElement(headerLogo);
		}
		return this;
	}


/////////////////
//
//
//@FindBy(css = "[for=\"shippingOptionType-SelfCheckout\"]")
//WebElement selfCheckout;
//
//
//public CheckOutPage selectSelfCheckout() {
//clickOnElement(selfCheckout);
//log.info("clicked on selfCheckout");
//
//return this;
//}
}


