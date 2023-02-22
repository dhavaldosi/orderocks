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
	
    @FindBy(css = "[href='/contactus']")
	WebElement contactus;

	@FindBy(css = "[id='FullName']")
	WebElement yourName;

	@FindBy(css = "[id='Email']")
	WebElement yourEmail;

	@FindBy(css = "[id='enquiry']")
	WebElement enquiry;

	@FindBy(css = "[class='button-1 contact-us-button'][value='Submit']")
	WebElement submit;

	@FindBy(css = "[class='result']")
	WebElement result;

	@FindBy(xpath = "//span[text()='Grocery']")
	WebElement grocery;
	
	@FindBy(xpath = "//a[contains(text(),'Hello')]")
	WebElement accountIcon;

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

	@FindBy(xpath = "//a[text()=\"Angel_Market\"]")
	WebElement selectVendor2;
	
    @FindBy(xpath = "//a[text()='Pepsi 2.25 L']")
	WebElement Product1;
	
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
	
	@FindBy(xpath = "//a[text()='Mythri']")
	WebElement selectShop;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logOut;
	
	@FindBy(css = "[class='button-2 add-to-wishlist-button'] ")
	WebElement wishlist;
	
	@FindBy(css = "[class='ico-wishlist']")
	WebElement wishlistIcon;
	
	@FindBy(css = "a[class='product-name']")
	WebElement verifywishlist;
	
	@FindBy(css = "[class='search-box-text narrow k-input']")
	WebElement searchBox;

	@FindBy(css = "[class='button-2 add-to-compare-list-button']")
	WebElement comparelistIcon;
	
	@FindBy(css = "[class='ico-compare']")
	WebElement comparelist;
	
	@FindBy(css = "[class*='product-name'] a")
	WebElement verifycomparelist;
	
	public String getSearchBoxPlaceHolderValue() {
		return searchBox.getAttribute("placeholder");
	}
	
	public HomePage scrollToElementAndClick() {
		scrollToElementAndClick(contactus);
		return this;
	}

	public HomePage enterFullName() {
		type(yourName, "Avantika Tambekar");
		return this;
	}

	public HomePage enterEmail() {
		type(yourEmail, "orderocks.automation.user@gmail.com");
		return this;
	}

	public HomePage enterEnquiry() {
		type(enquiry, "Want to apply for Vendor");
		return this;
	}

	public HomePage clickSubmit() {
		clickOnElement(submit);
		return this;
	}

	public String getTitle() {
		waitForelement(result);
		log.info("Page title is : " + result.getText());
		return result.getText();
	}

	public HomePage hoverAllCategories() {
		hoverOnElement(allCategories);
		log.info("Hovered on all categories.");
		return this;
	}
	
	public HomePage clickLogOut() {
		clickOnElement(logOut);
		log.info("Clicked on logout.");
		return this;
	}
	
	public HomePage clickMilkProducts() {
		hoverAndClickOnElement(milkProducts);
		log.info("Clicked on milk product.");
		return this;
	}
	
	public HomePage clickDesserts() {
		hoverAndClickOnElement(desserts);
		log.info("Clicked on desserts.");
		return this;
	}

	public void enterValue() {
		addToCart.click();
	}

	public HomePage giftCardCouponCode () {
		clickOnElement(giftCardCouponCode);
		log.info("Clicked on gift card coupon code.");
		return this;
	}

	public WebElement add() {
		return add;
	}
	
	public HomePage clickSearchBar() {
		clickOnElement(searchBar);
		log.info("Clicked on search bar.");
		return this;
	}
	
	public HomePage clickAccountIcon() {
		clickOnElement(accountIcon);
		log.info("Clicked on account icon.");
		return this;
	}

	public HomePage clickManufacturers() {
		clickOnElement(manufacturers);
		log.info("Clicked on manufacturers.");
		return this;
	}

	public HomePage clickCustomerFeedBack() {
		clickOnElement(customerFeedBack);
		log.info("Clicked on customer feedback.");
		return this;
	}

	public HomePage clickVendorsAgreement() {
		clickOnElement(vendorsAgreement);
		log.info("Clicked on vendor agreement.");
		return this;
	}

	public HomePage clickNewProducts() {
		clickOnElement(newProducts);
		log.info("Clicked on new product.");
		return this;
	}

	public HomePage clickZipCodeVal() {
		clickOnElement(zipCodeVal);
		log.info("Clicked on zip code val.");
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
		log.info("Clicked on zip code button.");
		return this;
	}

	public HomePage clickPreviousButton() {
		hoverAndClickOnElement(previousButton);
		log.info("Clicked on privious button.");
		return this;
	}

	public HomePage clickCart() {
		clickOnElement(cart);
		log.info("Clicked on cart.");
		return this;
	}

	public HomePage selectGrocery() {
		clickOnElement(grocery);
		log.info("Selected grocery.");
		return this;
	}

	public HomePage getVendorList() {
		clickOnElement(getVendor);
		log.info("Selected on vendor.");
		return this;
	}

	public HomePage clickSearchIcon() {
		clickOnElement(btnSearch);
		log.info("Clicked on search icon.");
		return this;
	}

	public HomePage selectVendorFromList() {
		clickOnElement(selectVendor);
		log.info("Selected vendor from list.");
		return this;
	}
	
	public HomePage selectVendorFromList2() {
		clickOnElement(selectVendor2);
		return this;
	}
	
	public String product2() {
		return Product1.getText();
	}
	
	public String getproduct2() {
		waitForelement(Product1);
		return Product1.getText();
	}

	public HomePage clickAddToCart() {
		clickOnElement(addToCart);
		log.info("Clicked on add to cart.");
		return this;
	}
	
	public HomePage selectDiscountCodesAndVouchers() {
		clickOnElement(discountCodesAndVouchers);
		log.info("Clicked on discount codes and vouchers.");
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
		log.info("Clicked on checkout.");
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
	public HomePage selectShopFromList() {
		clickOnElement(selectShop);
		log.info("Selected shop from list.");
		return this;
	}


	public boolean isWelComeMessagePresent() {
		return elementIsPresent(welComeMessage);
	}

	@FindBy(xpath = "//*[@id='ZipCode']")
	WebElement zipCode;

	@FindBy(xpath = "//span[text()='80134']")
	WebElement zipCodeToLogin;

	@FindBy(xpath = "//span[text()='Restaurant']")
	WebElement restaurant;

	@FindBy(xpath = "//a[text()=\"PK Dessert home\"]")
	WebElement pkDessertHome;

	@FindBy(xpath = ("//*[@class=\"bar-notification error\"]"))
	WebElement barNotificationError;

	@FindBy(xpath = "//*[@class=\"content\"]")
	WebElement outOfStockText;

	public HomePage clickZipCode() {
		clickOnElement(zipCode);
		log.info("Clicked on zip code.");
		return this;
	}

	public HomePage clickZipCodeToLogin() {
		clickOnElement(zipCodeToLogin);
		log.info("Clicked on zip code to login.");
		return this;
	}
	
	public HomePage enterZipCode() {
		type(zipCode, "80134");
		return this;
	}
	public HomePage clickRestaurant() {
		clickOnElement(restaurant);
		log.info("Clicked on restaurant.");
		return this;
	}

	public HomePage selectpkDessertHome() {
		clickOnElement(pkDessertHome);
		log.info("Selected pk dessert home.");
		return this;
	}
	
	
	public String getOutofstockText() {
		waitForelement(outOfStockText);
		return outOfStockText.getText();
	}

	public HomePage clickWishlist() {
		clickOnElement(wishlist);
		return this;
	}

     public HomePage clickWishlistIcon() {
		clickOnElement(wishlistIcon);
		return this;
	}
     
     public String getwishlist() {
		return verifywishlist.getText();
	}

    
     public HomePage clickComparelistIcon() {
 		clickOnElement(comparelistIcon);
 		return this;
 	}
     
     public HomePage clickCompareList() {
 		clickOnElement(comparelist);
 		return this;
     }
     
     public String getcompareList() {
 		return verifycomparelist.getText();
 	}

	}
	