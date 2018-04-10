package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class HomePage {
	private WebDriver driver;
	public HomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	public boolean isTitle(String title) {
		return driver.getTitle().equals(title);
		
	} 
	
	public boolean isUrl(String url) {
		return driver.getCurrentUrl().equals(url);
		  
	}
	  
	@FindBy(xpath="//div[@class='menu_text']")
	public WebElement WeclomeBackAdmin;
	
	@FindBy(xpath="//a[contains(text(),'Login or register')]")
	public WebElement loginTop2;
	
	@FindBy(xpath="//a[contains(text(),'Audio CD')]")
	public WebElement AudioCD;

	@FindBy(xpath="//select[@id='sort']")
	public WebElement sortDropDown;
	
	@FindBy(xpath="//option[@value='rating-DESC']")
	public WebElement RatingHighest;
	
	@FindBy(xpath="//a[@class='prdocutname'][1]")
	public WebElement NewFrenchWith;
	
	@FindBy(xpath="//a[@class='cart']")
	public WebElement AddtoCart;
	
	@FindBy(id = "cart_quantity111")
	public WebElement Quantity;
	
	@FindBy(xpath="//button[@title='Update']")
	public WebElement Update;
	
	@FindBy(xpath="//select[@id='estimate_country']")
	public WebElement Country;
	
	@FindBy(xpath="//select[@id='estimate_country_zones']")
	public WebElement State;
	
	@FindBy(xpath="estimate_country_zones")
	public WebElement City;
	
	@FindBy(xpath="//input[@id='estimate_postcode']")
	public WebElement ZIPPostCode;
	
	@FindBy(id = "cart_checkout2")
	public WebElement checkout2;
	
	@FindBy(id = "checkout_btn")
	public WebElement confirmOrder;
		
	@FindBy(xpath="//div[@class='productfilneprice']")
	public WebElement price;
	
	@FindBy(xpath="(//div[@class='oneprice'])[2]")
	public WebElement price1;
	
	@FindBy(xpath="(//i[@class='fa fa-cart-plus fa-fw'])[2]")
	public WebElement cart;
	 
	@FindBy(xpath = "//ul[@id = 'main_menu_top']//span[.='Account']")
	public WebElement accountTop;
	
	@FindBy(xpath="//ul[@class='side_account_list']//li[3]//a")
	public WebElement EditAccount;
	
	@FindBy(id ="AccountFrm_firstname")
	public WebElement firstName;
	
	@FindBy(id ="AccountFrm_lastname")
	public WebElement lastname;
	
	@FindBy(id ="AccountFrm_email")
	public WebElement email;
	
	@FindBy(id ="AccountFrm_telephone")
	public WebElement telephone;
	
	@FindBy(id ="AccountFrm_fax")
	public WebElement fax;
	
	@FindBy(xpath="//button[@class='btn btn-orange pull-right lock-on-click']")
	public WebElement continuepage;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement alertSuccess;
	
	@FindBy(xpath="//a[@class='btn btn-default mr10  mb10']")
	public WebElement continueShopping;
	
	@FindBy(xpath = "//ul[@id = 'main_menu_top']//a[@class = 'sub menu_login']")
	public WebElement loginTop;
	
	@FindBy(xpath = "//a[@class='active menu_home']")
	public WebElement Home;
	
	@FindBy(xpath="//ul[@id='main_menu']//li[@data-id='menu_specials']")
	public WebElement DropDownSpecials;
	
	@FindBy (xpath="//ul[@id='main_menu']//li[@data-id='menu_account']")
	public WebElement DropDownMenuAccount;
	
	@FindBy(xpath="//ul[@id='main_menu']//li[@data-id='menu_cart']")
	public WebElement DropDownMenuCart;
	
	@FindBy(xpath="//ul[@id='main_menu']//li[@data-id='menu_checkout']")
	public WebElement DropDownMenCheckout;
	
	
	@FindBy(xpath ="(//a[contains(text(),'Apparel & accessories')])[2]")
	public WebElement APPARELANDACCESSORIES;
	
	@FindBy(xpath ="(//a[contains(text(),'Makeup')])[2]")
	public WebElement MAKEUP;
	
	@FindBy(xpath="//a[contains(text(),'Cheeks')]")
	public WebElement Cheeks;
	
	@FindBy(xpath="(//a[contains(text(),'Eyes')])[1]")
	public WebElement Eyes;
	
	@FindBy(xpath="(//a[contains(text(),'Eyes')])[2]")
	public WebElement Eyes1;
	
	@FindBy(xpath="(//a[contains(text(),'Face')])[2]")
	public WebElement Face;
	
	@FindBy(xpath="(//a[contains(text(),'Lips')])[1]")
	public WebElement Lips;
	
	@FindBy(xpath="(//a[contains(text(),'Nails')])[1]")
	public WebElement Nails;
	
	@FindBy(xpath="(//a[contains(text(),'Value Sets')])[1]")
	public WebElement ValueSets;
	
	@FindBy(xpath ="(//a[contains(text(),'Skincare')])[2]")
	public WebElement SKINCARE;
	
	@FindBy(xpath ="(//a[contains(text(),'Fragrance')])[2]")
	public WebElement FRAGRANCE;
	
	@FindBy(xpath ="(//a[contains(text(),'Men')])[5]")
	public WebElement MEN;
	
	@FindBy(xpath ="//a[contains(text(),'Women')]")
	public WebElement WOMEN;
	
	@FindBy(xpath ="(//a[contains(text(),'Hair Care')])[2]")
	public WebElement HAIRCARE;
	
	@FindBy(xpath ="(//a[contains(text(),'Books')])[2]")
	public WebElement BOOKS;

	@FindBy (xpath="//p[contains(text(),'Fragrance for Women')]")
	public WebElement FragranceForWomen;
	
	@FindBy(xpath="//a[@title='Beauty Eau de Parfum']")
	public WebElement beautyEauDeParfum;
	
	@FindBy(xpath="//span[@class='bgnone']")
	public WebElement beautyEauDeParfum2;
	
	@FindBy (xpath="//span[@class='maintext']")
	public WebElement EyesElementOnPage;
	
	@FindBy (xpath="//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/a/img")
	public WebElement productAbsolueEyesPreciousCells;
	
	@FindBy (xpath="//span[@class='bgnone']")
	public WebElement productAbsolueEyesPreciousCells2;
	
	@FindBy (xpath="//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/a[1]")
	public WebElement viewProductAbsolueEyesPreciousCells;
	
	@FindBy(xpath="//*[@id=\"categorymenu\"]/nav/ul/li[4]/div/ul[1]/li[1]/a")
	public WebElement Eyes2;
	

	//Maria
		@FindBy(xpath ="(//a[@class='prdocutname'])[1]")
		public WebElement blackshoes;
		
		@FindBy(xpath ="(//a[@class='prdocutname'])[2]")
		public WebElement redshoes;
		
		
		@FindBy(xpath ="(//a[@class='prdocutname'])[3]")
		public WebElement purpelshoes;
		
		
		@FindBy(xpath ="(//a[@class='prdocutname'])[4]")
		public WebElement greyshoes;
		
		@FindBy(xpath="//input[@id='filter_keyword']")
		public WebElement searchkeyword;
		
		
}
