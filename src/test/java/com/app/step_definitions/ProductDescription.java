package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.HomePage;
import com.app.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDescription {
	
	HomePage hp = new HomePage();
	
	@When("^I go to tab FRAGRANCE$")
	public void i_go_to_tab_FRAGRANCE() {
	    BrowserUtils.hover(hp.FRAGRANCE);
	}

	@When("^I choose option WOMEN$")
	public void i_choose_option_WOMEN() {
	    hp.WOMEN.click();
	}

	@Then("^I am on page with WOMEN products$")
	public void i_am_on_page_with_WOMEN_products() {
	    assertTrue(hp.FragranceForWomen.isDisplayed());
	}

	@Then("^I see the product with name BEAUTY EAU DE PARFUM")
	public void i_see_the_product_with_name_BEAUTY_EAU_DE_PARFUM() {
	    assertTrue(hp.beautyEauDeParfum.isDisplayed());
	}

	@When("^I click on the product with name BEAUTY EAU DE PARFUM")
	public void i_click_on_the_product_with_name_BEAUTY_EAU_DE_PARFUM() {
		hp.beautyEauDeParfum.click();
	}

	@Then("^I see page with the same product name  BEAUTY EAU DE PARFUM")
	public void i_see_page_with_the_same_product_name_BEAUTY_EAU_DE_PARFUM() {
	    assertTrue(hp.beautyEauDeParfum2.isDisplayed());
	}

	@When("^I go to tab SKINCARE$")
	public void i_go_to_tab_SKINCARE() {
	    BrowserUtils.hover(hp.SKINCARE);
	}

	@When("^I choose option EYES$")
	public void i_choose_option_EYES() {
	    //BrowserUtils.waitForVisibility(hp.Eyes2, 2);
		hp.Eyes2.click();
	}

	@Then("^I am on page with EYES products$")
	public void i_am_on_page_with_EYES_products() {
	    assertTrue(hp.EyesElementOnPage.isDisplayed());
	}

	@Then("^I see product ABSOLUTE EYES PRECIOUS CELLS$")
	public void i_see_product_ABSOLUTE_EYES_PRECIOUS_CELLS() {
	    assertTrue(hp.productAbsolueEyesPreciousCells.isDisplayed());
	}

	@When("^I hover over a product$")
	public void i_hover_over_a_product() {
	    BrowserUtils.hover(hp.productAbsolueEyesPreciousCells);
	}

	@When("^I click on View button$")
	public void i_click_on_View_button() {
	    hp.viewProductAbsolueEyesPreciousCells.click();
	}

	@Then("^I see page with the same product name ABSOLUTE EYES PRECIOUS CELLS$")
	public void i_see_page_with_the_same_product_name_ABSOLUTE_EYES_PRECIOUS_CELLS() {
	    assertTrue(hp.productAbsolueEyesPreciousCells2.isDisplayed());
	}


}
