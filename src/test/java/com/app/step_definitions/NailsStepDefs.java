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
	
	@When("^I hover over the \"([^\"]*)\"$")
	public void i_hover_over_the(String arg1) {
	    BrowserUtils.hover(ma.makeUp);
	    
	}

	@Then("^following menu options should be visible:$")
	public void following_menu_options_should_be_visible(List<String> list) {
			assertTrue(hp.Cheeks.isDisplayed());
			assertTrue(hp.Eyes.isDisplayed());
			assertTrue(hp.Face.isDisplayed());
			assertTrue(hp.Lips.isDisplayed());
			assertTrue(hp.Nails.isDisplayed());
			assertTrue(hp.ValueSets.isDisplayed());
			
	}

	@Then("^I should be able to choose \"([^\"]*)\"$")
	public void i_should_be_able_to_choose(String arg1) {
		hp.Nails.click();	
		BrowserUtils.waitFor(4);
		//need to add NailPolish
		ma.NailPolish.click();
	}

	@Then("^Verify the Pirce is \"([^\"]*)\"$")
	public void verify_the_Pirce_is(String total) {
		assertEquals(hp.price,total);
		System.out.println(hp.price);
		System.out.println(total);
	    
	}

	@When("^I click on the add to cart button$")
	public void i_click_on_the_add_to_cart_button() {
		ma.addToCart.click();
	   
	}

	@Then("^I should be able to Choose Country \"([^\"]*)\"$")
	public void i_should_be_able_to_Choose_Country(String arg1) {
		BrowserUtils.waitFor(4);
	   hp.Country.sendKeys("United States");
	}

	@Then("^I choose City \"([^\"]*)\"$")
	public void i_choose_City(String arg1) {
		hp.City.sendKeys("Illinois");
	    
	}

	@Then("^I type Zipcode \"([^\"]*)\"$")
	public void i_type_Zipcode(String arg1) {
	    hp.ZIPPostCode.sendKeys("60018");
	}

	@Then("^I should be able to click Check out button on the bottom$")
	public void i_should_be_able_to_click_Check_out_button_on_the_bottom() {
	   hp.checkout2.click();
	}

	@Then("^Click on the Continue Shopping$")
	public void click_on_the_Continue_Shopping() {
		hp.confirmOrder.click();
	    
	}

	@Then("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String arg1) {
	   
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) {
	    
	}

	@When("^I hover over ont the Image$")
	public void i_hover_over_ont_the_Image() {
	 
	}

	@Then("^I \"([^\"]*)\" option shoulde be visible$")
	public void i_option_shoulde_be_visible(String arg1) {
	   
	}

}