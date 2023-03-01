package com.orderocks.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(css = "[class='header-logo'] [title='ORDEROCKS']")
	WebElement logo;

	@FindBy(xpath = "//a[text()='Contact us']")
	WebElement contactus;

	@FindBy(css = "[class='footer-middle']")
	WebElement footerMiddleSection;

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

	@FindBy(css = "[value='Clear shopping cart']")
	WebElement clearShoppingCart;

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

	@FindBy(css = "[class='button-2 continue-shopping-button']")
	WebElement continueShopping;

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

	@FindBy(xpath = "//a[text()='My account']")
	WebElement myAccount;

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

	@FindBy(css = "[class='ico-account opener']")
	WebElement myaccount;

	@FindBy(css = "[class='ico-account']")
	WebElement myaccounticon;

	@FindBy(css = "[class='customer-reviews'] a")
	WebElement myproductreviews;

	@FindBy(css = "[class='page-title']")
	WebElement verifyreviews;

	@FindBy(css = "[class*='navigation desktop'] [class=list] li a")
	List<WebElement> myAccountTabs;

	@FindBy(xpath = "//*[@id=\"instant-search-manufacturers\"]")
	WebElement dropdown;

	@FindBy(css = "[class='product-title'] a")
	WebElement clickonproductname;

	@FindBy(css = "[href='#quickTab-reviews'] ")
	WebElement clickonreviews;

	@FindBy(css = "[class='write-review-title'] ")
	WebElement clickonwritereviews;

	@FindBy(css = "[id='AddProductReview_Title'] ")
	WebElement entertitle;

	@FindBy(css = "[id='AddProductReview_ReviewText'] ")
	WebElement entertext;

	@FindBy(css = "[id='add-review'] ")
	WebElement submitbutton;

	@FindBy(css = "[class='submitReviewResult']")
	WebElement verifyreview;

	@FindBy(css = "[class='product-name']")
	WebElement prtname1;

	@FindBy(css = "[class='customer-orders']")
	WebElement order;

	@FindBy(css = "[class='button-2 return-items-button']")
	WebElement returnItem;

	@FindBy(css = "[class='button-1 submit-return-request-button']")
	WebElement returnRequest;

	@FindBy(css = "	[name='quantity2461']")
	WebElement selectQty;
	
	@FindBy(xpath = "//h1[text()='Return item(s) from ']")
	WebElement verifyResult;
	
	@FindBy(css = "[class='tbody'] li a[class='name']")
	List<WebElement> getAllVendors;
	
	@FindBy(css = "[class='ico-account opener']")
	WebElement customerinfo;
	
	@FindBy(css = "[class='customer-orders']")
	WebElement Orders;
	
	@FindBy(xpath = "//*[@class='section order-item'][1] //*[@class='buttons'] /input")
	WebElement Details;
	
	@FindBy(css = "[class='button-1 re-order-button']")
	WebElement ReOrder;
	
	public HomePage clickCustomerInfo() {
		clickOnElement (customerinfo);
		return this;
	}
	
	public HomePage clickOrders() {
		clickOnElement (Orders);
		return this;
	}
	
	public HomePage clickDetails() {
		clickOnElement (Details);
		return this;
	}
	
	public HomePage clickReOrder() {
		clickOnElement (ReOrder);
		return this;
	}
	

	public HomePage selectMyAccountTab(String selectTab) {

		for (int i = 0; i < myAccountTabs.size(); i++) {
			if (myAccountTabs.get(i).getText().equals(selectTab)) {
				clickOnElement(myAccountTabs.get(i));
				log.info("Selected tab is : " + selectTab);
				break;
			}
		}
		return this;
	}

	public HomePage selectVendor(String selectVendor) {
		for (int i = 0; i < getAllVendors.size(); i++) {
			if (getAllVendors.get(i).getText().equals(selectVendor)) {
				clickOnElement(getAllVendors.get(i));
				log.info("Selected tab is : " + selectVendor);
				break;
			}
		}
		return this;
	}

	public String getSearchBoxPlaceHolderValue() {
		return searchBox.getAttribute("placeholder");
	}

	public HomePage clicklogo() {
		clickOnElement(logo);
		return this;
	}

	public HomePage clickContactUs() {
		scrollToElement(footerMiddleSection);
		clickOnElement(contactus);
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

	public HomePage scrollToElementAndClickClearShoppingCart() {
		scrollToElementAndClick(clearShoppingCart);
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

	public HomePage giftCardCouponCode() {
		clickOnElement(giftCardCouponCode);
		log.info("Clicked on gift card coupon code.");
		return this;
	}

	public WebElement add() {
		return add;
	}

	public HomePage clickContinueShopping() {
		clickOnElement(continueShopping);
		return this;
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

	public HomePage clickMyAccount() {
		clickOnElement(myAccount);
		log.info("Clicked on my account.");
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
		waitForelement(addToCart);
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
		type(giftCardCouponCode, "9c24c57c-803f");
		return this;
	}

	public HomePage ClickAdd() {
		clickOnElement(add);
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
		waitForelement(pageTitle);
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

	@FindBy(css = "td[class=remove-from-cart]")
	WebElement removeProductFromCart;

	@FindBy(css = "[class=\"button-2 update-cart-button\"]")
	WebElement updateShoppingCart;

	@FindBy(css = "[class='no-data']")
	WebElement shoppingCartIsEmptyText;

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

	public HomePage clickOnMyAccount() {
		clickOnElement(myaccount);
		return this;
	}

	public String getMyReviewpage() {
		waitForelement(verifyreviews);
		return verifyreviews.getText();
	}

	public HomePage clicktonMyAccountIcon() {
		clickOnElement(myaccounticon);
		return this;
	}

	public HomePage clicktonMyProductReview() {
		clickOnElement(myproductreviews);
		return this;
	}

	public HomePage removeProductFromCart() {
		clickOnElement(removeProductFromCart);
		log.info("clicked on removeProductfromCart");
		return this;
	}

	public HomePage updateShoppingCart() {
		clickOnElement(updateShoppingCart);
		log.info("clicked on updateShoppingCart");
		return this;
	}

	public String getShoppingCartStatus() {
		return shoppingCartIsEmptyText.getText();
	}

	public String getSubmitMsg() {
		waitForelement(verifyreview);
		return verifyreview.getText();
	}

	public HomePage clicktonProductTitle() {
		clickOnElement(clickonproductname);
		return this;
	}

	public HomePage clickOnSubmitReviews() {
		clickOnElement(submitbutton);
		return this;
	}

	public HomePage enterReviewsTitle() {
		entertitle.sendKeys("Test");
		return this;
	}

	public HomePage enterReviewsText() {
		entertext.sendKeys("good");
		return this;

	}

	public HomePage clicktOnReviews() {
		clickOnElement(clickonreviews);
		return this;
	}

	public HomePage clicktonWriteReviews() {
		clickOnElement(clickonwritereviews);
		return this;
	}

	public HomePage clickOnDropdown() {
		clickOnElement(dropdown);
		return this;
	}

	public HomePage selectByVisibleText() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Amul");
		return this;
	}

	public String getCategoryList() {
		waitForelement(dropdown);
		return dropdown.getText();
	}

	@FindBy(css = "span[class=\"product-unit-price\"]")
	WebElement productPrice;

	@FindBy(css = "input[class=\"qty-input\"]")
	WebElement cartQuantity;

	@FindBy(css = "span[class=\"product-subtotal\"]")
	WebElement productSubtotal;

	@FindBy(css = "[href='/vendor/apply']")
	WebElement applyForVendorAccount;

	@FindBy(css = "[name=vendor_attribute_1]")
	WebElement enterVendorContactNumber;

	@FindBy(css = "[class=\'name\'][placeholder=\'Enter vendor name.\']")
	WebElement enterVendorName;

	@FindBy(css = "[class='name'][placeholder='Enter your email address.']")
	WebElement enterVendorEmailAddress;

	@FindBy(css = "[class='description']")
	WebElement enterVendorDescription;

	@FindBy(css = "[name='vendor_attribute_3']")
	WebElement enterVendorAddress;

	@FindBy(css = "[name=\"vendor_attribute_4\"]")
	WebElement enterPickUpInstructions;

	@FindBy(css = "div[class=\"buttons\"] [type=\"submit\"]")
	WebElement submitVendorApplication;

	@FindBy(css = "[class=\"result\"]")
	WebElement vendorApplicationResult;

	@FindBy(css = "[class=\"result\"]")
	WebElement reApplyForVendorAccountResult;

	public HomePage clickOnCartQuantity() {
		waitForelement(cartQuantity);
		clickOnElement(cartQuantity);
		log.info("Clicked On Cart Quantity");
		return this;
	}

	public HomePage enterCartQuantity() {
		type(cartQuantity, "3");
		log.info("Entered cart quantity");
		return this;
	}

	public HomePage clearcartquantity() {
		cartQuantity.clear();
		log.info("Cleared cart quantity");
		return this;
	}

	public HomePage getProductPrice() {
		waitForelement(productPrice);
		// String productPrice= productPrice.getText();
		log.info("productPrice");
		return this;
	}

	public HomePage getProductSubTotal() {
		String productSubTotal = productSubtotal.getText();
		log.info(productSubTotal);
		return this;
	}

	public String getalertMessage() {
    log.info("Alert message is :Changing stores may remove items in the cart");
		return result.getText();

	}

	public String getProductName() {
		waitForelement(prtname1);
		return prtname1.getText();
	}

	public HomePage clickOnApplyForVendorAccount() {
		scrollToElement(footerMiddleSection);
		waitForelement(applyForVendorAccount);
		clickOnElement(applyForVendorAccount);
		return this;

	}

	public HomePage enterVendorName() {
		clickOnElement(enterVendorName);
		type(enterVendorName, "Vendor A");
		log.info("Entered Vendor Name");
		return this;
	}

	public HomePage clickOnenterVendorEmailaddress() {
		waitForelement(enterVendorEmailAddress);
		clickOnElement(enterVendorEmailAddress);
		log.info("clicked On enter Vendor email Address");
		return this;
	}

	public HomePage clearExistingEmailaddress() {
		waitForelement(enterVendorEmailAddress);
		enterVendorEmailAddress.clear();
		log.info("Cleared Existing Email Address");
		return this;
	}

	public HomePage enterVendorEmailaddress() {
		waitForelement(enterVendorEmailAddress);
		clickOnElement(enterVendorEmailAddress);
		type(enterVendorEmailAddress, "vendora@gmail.com");
		log.info("Entered Vendor Email Address");
		return this;

	}

	public HomePage enterVendorDescription() {
		waitForelement(enterVendorDescription);
		clickOnElement(enterVendorDescription);
		type(enterVendorDescription, "Automation Test-We, Vendor A, supplies an Indian Snacks of rich quality ");
		return this;
	}

	public HomePage enterVendorContactNumber() {
		waitForelement(enterVendorContactNumber);
		clickOnElement(enterVendorContactNumber);
		type(enterVendorContactNumber, "0123456789");
		log.info("Entered vendor contact Number");
		return this;
	}

	public HomePage enterVendorAddress() {
		waitForelement(enterVendorAddress);
		clickOnElement(enterVendorAddress);
		type(enterVendorAddress, " 8660 S Quebec St, Lone Tree, CO 80124, United States");
		log.info("Entered vendor Address");
		return this;
	}

	public HomePage enterPickUpInstructions() {
		clickOnElement(enterPickUpInstructions);
		waitForelement(enterPickUpInstructions);
		type(enterPickUpInstructions, "Dasher Enter From Back Gate No. 37");
		log.info("Entered Pick up Instructions");
		return this;
	}

	public HomePage submitVendorApplication() {
		waitForelement(submitVendorApplication);
		clickOnElement(submitVendorApplication);
		log.info("Clicked On Submit");
		return this;
	}

	public String vendorApplicationResult() {
		waitForelement(vendorApplicationResult);
		log.info("vendorApplicationResult is : " + vendorApplicationResult.getText());
		return vendorApplicationResult.getText();
	}

	public String reApplyForVendorAccountResult() {
		waitForelement(reApplyForVendorAccountResult);
		log.info("reAppliedForvendoraccount");
		log.info("reApplyForVendorAccountResult is : " + reApplyForVendorAccountResult.getText());
		return vendorApplicationResult.getText();
	}	
	
		public HomePage clicktonOrderTitle() {
			clickOnElement(order);
			return this;
	}
		
		public HomePage clicktonReturnItem() {
			clickOnElement(returnItem);
			return this;
	}
		
		public HomePage clicktonSubmitReturnRequest() {
			clickOnElement(returnRequest);
			return this;
	}
		
		public HomePage clicktonQuntityReturnRequest() {
			clickOnElement(selectQty);
			return this;
	}
		
		public HomePage selectByVisibleText2() {
			Select select = new Select(dropdown);
			waitForelement(dropdown);
			select.selectByIndex(1);
			return this;
	}
		
		public String getVerifyReturnMsg() {
			waitForelement(verifyResult);
			return verifyResult.getText();
	}


		
}
