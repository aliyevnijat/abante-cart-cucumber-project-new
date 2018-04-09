package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.app.pages.HomePage;
import com.app.pages.MyAccount;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NailsStepDefs {
	HomePage hp = new HomePage();
	MyAccount ma = new MyAccount();
	BrowserUtils BR = new BrowserUtils();
	
	@When("^I hover over the \"([^\"]*)\"$")
	public void i_hover_over_the(String arg1) {
	    BrowserUtils.hover(ma.makeUp);
	    
	}

//	@Then("^following menu options should be visible (MAKEUP|CHEEKS|EYES|FACE|LIPS|NAILS|VALUESETS):$")
//	public void following_menu_options_should_be_visible(String menu, List<String> menuList) {
//		
//		List<WebElement> menuOptions = ma.MakeUpDropDown(menu);
//		List<String> topMenuOptionsString = BrowserUtils.getElementsText(menuOptions);
//		assertEquals(topMenuOptionsString.size(), menuList.size(), "Number of expected menu options did not match");
//		for (int i = 0; i < menuList.size(); i++) {
//			assertEquals(topMenuOptionsString.get(i).trim(), menuList.get(i));
//		}
//	}
	@Then("^following menu options should be visible:$")
	public void following_menu_options_should_be_visible(List<String> List) {
			BrowserUtils.waitFor(10);
			assertTrue(hp.Cheeks.isDisplayed());
			assertTrue(hp.Eyes.isDisplayed());
			assertTrue(hp.Face.isDisplayed());
			assertTrue(hp.Lips.isDisplayed());
			assertTrue(hp.Nails.isDisplayed());
			assertTrue(hp.ValueSets.isDisplayed());
			
	}

	@Then("^I should be able to choose \"([^\"]*)\"$")
	public void i_should_be_able_to_choose(String arg1) {
		BrowserUtils.waitFor(2);
		BrowserUtils.hover(hp.MAKEUP);
		hp.Nails.click();	
		
		
	}

	@Then("^Verify the Pirce is \"([^\"]*)\"$")
	public void verify_the_Pirce_is(String total) {
		assertTrue(hp.price1.isDisplayed());
	    
	}

	@When("^I click on the add to cart button$")
	public void i_click_on_the_add_to_cart_button() {
		hp.cart.click();
		hp.AddtoCart.click();
	   
	}

	@Then("^I should be able to Choose Country \"([^\"]*)\"$")
	public void i_should_be_able_to_Choose_Country(String arg1) {
		BR.Selects(hp.Country, "United States");
		
	}

	@Then("^I choose City \"([^\"]*)\"$")
	public void i_choose_City(String arg1) {
		BR.Selects(hp.State,"Illinois");
	    
	}

	@Then("^I type Zipcode \"([^\"]*)\"$")
	public void i_type_Zipcode(String arg1) {
	    hp.ZIPPostCode.sendKeys("60018");
	}

	@Then("^Click on the Continue Shopping$")
	public void click_on_the_Continue_Shopping() {
		BrowserUtils.waitFor(5);
		hp.continueShopping.click();
	    
	}
	
//	@When("^I hover over the \"([^\"]*)\"$")
//	public void i_hover_over_SkinCare(String arg1) {
//	    BrowserUtils.hover(hp.SKINCARE);
//	    
//	}
	
}