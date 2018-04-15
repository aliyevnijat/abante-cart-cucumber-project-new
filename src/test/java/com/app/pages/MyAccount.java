package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MyAccount {
	private WebDriver driver;

	public MyAccount() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class = 'maintext']")
	public WebElement mainText;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Apparel & accessories')]]")
	public WebElement apparelAndAccessories;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Makeup')]]")
	public WebElement makeUp;
	
	@FindBy(xpath="(//a[@class='prdocutname'])[2]")
	public WebElement NailPolish;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Skincare')]]")
	public WebElement skincare;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Fragrance')]]")
	public WebElement fragrance;

	@FindBy(xpath = "(//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Men')]])[2]")
	public WebElement men;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Hair Care')]]")
	public WebElement hairCare;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']//a[text()[contains(.,'Books')]]")
	public WebElement books;

	@FindBy(xpath = "//a[text()[contains(.,'T-shirts')]]")
	public WebElement t_Shirts;

	@FindBy(xpath = "//ul[@id='main_menu']//li")
	public List<WebElement> hopeDropDownMenu;
	
	@FindBy(xpath ="//div[@class='subcategories']")
	public List<WebElement> MakeUpDropDown;

	@FindBy(xpath = "//a[@class='active menu_home']")
	public WebElement Home;

	@FindBy(xpath = "//a[@title ='Fruit of the Loom T-Shirts 5 Pack - Super Premium']")
	public WebElement fruitOfTheLoom;

	@FindBy(xpath = "//a [@class = 'cart']")
	public WebElement addToCart;

	@FindBy(xpath = "//span[@class = 'bold totalamout']")
	public WebElement totalAmount;

	@FindBy(xpath = "//a[@class = 'btn btn-default mr10  mb10']")
	public WebElement continueShopping;

	@FindBy(xpath = "//a[text()[contains(.,'Mens Fine Cotton Giraffe Polo Shirts' )]]")
	public WebElement mensFineCotton;

	@FindBy(id = "cart_checkout2")
	public WebElement checkout2;

	@FindBy(id = "checkout_btn")
	public WebElement confirmOrder;

	@FindBy(id = "cart_quantity11926a4a29af72e9fa902217e00730cfec7")
	public WebElement cartQuantity;

	@FindBy(id = "cart_update")
	public WebElement cart_update;
	
	@FindBy(xpath="(//div[@class='pricetag jumbotron']//div[@class='oneprice'])[3]")
	public  WebElement dolarIcon;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	public WebElement moneyselect;
	
	@FindBy(xpath="//text()[.='€ Euro']")
	public WebElement euro;
	
	@FindBy(xpath="//div[@class='myaccountbox']//i[@class='fa fa-book fa-fw']")
	public WebElement myAccount;
	
	@FindBy(xpath="//tbody//tr")
	public List<WebElement> addressNumber;
	 
	 
	@FindBy(xpath="//a[@title='New Address']")
	public WebElement NewAddress;
	
	@FindBy(xpath="//button[@title='Continue']")
	public WebElement ContinueButton;
	
	@FindBy(xpath="//div[@class=' ct_padding_right']//tbody//tr//td[1]")
	public List<WebElement> addressBookAddres;
	 	 
	
	@FindBy(xpath="//div[@class='pricetag jumbotron']//div[@class='price']")
	public WebElement verifyList;
	
	@FindBy(xpath="//text() [.='Absolue Eye Precious Cells']")
	public WebElement AbsuluteEye;
	
	@FindBy(id="product_quantity")
	public WebElement ProductQiant1;
	  
	@FindBy(xpath="//div[@class='productfilneprice']")
	public WebElement unitPrice;
	
	@FindBy(xpath="//span[@class='total-price']")
	public WebElement totalPrice;
	
	@FindBy(xpath="//span[@class='bgnone']")
	public WebElement ProductName;
	
	@FindBy(xpath="//a[@class='cart']")
	public WebElement cart;
	
	@FindBy(id="AddressFrm_firstname")
	public WebElement FirstName;
	
	@FindBy(id="AddressFrm_lastname")
	public WebElement LastName;
	
	@FindBy(id="AddressFrm_company")
	public WebElement company;
	
	@FindBy(id="AddressFrm_address_1")
	public WebElement Address1;
	
	@FindBy(id="AddressFrm_city")
	public WebElement City;
	
	@FindBy(id="AddressFrm_zone_id")
	public WebElement Region;
	
	@FindBy(id="AddressFrm_postcode")
	public WebElement CountryId;
	 	
	@FindBy(id="sort")
	public WebElement sort;
	
	@FindBy(xpath="cart_quantity65")
	public WebElement cartQuantity2;
	
	@FindBy(id="//table[@class='table table-striped table-bordered']//tbody//td[@class='align_left'][1]")
	public WebElement ProductName2;

	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//td[@class='align_right'][2]")
	public WebElement TOTALPRICE2;
		
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//td[@class='align_right'][1]")
	public WebElement UNITPRICE2;
	

	public List<WebElement> menuOptions(String menuName) {
		String xpath = "";
		if (menuName.equals("Apparel & Accessories")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[1]//li";
		}
		if (menuName.equals("MAKEUP")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[3]//li";
		}
		if (menuName.equals("SKINCARE")) {
			xpath = "//a[contains(text(),'Sun')]/../..//li//a";
		}
		if (menuName.equals("FRAGRANCE")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[7]//li";
		}
		if (menuName.equals("MEN")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[9]//li";
		}
		if (menuName.equals("HAIR CARE")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[11]//li";
		}
		if (menuName.equals("BOOKS")) {
			xpath = "(//ul[@class='nav-pills categorymenu']//div[@class='subcategories']//ul)[13]//li";
		}
		return driver.findElements(By.xpath(xpath));
	}

}
