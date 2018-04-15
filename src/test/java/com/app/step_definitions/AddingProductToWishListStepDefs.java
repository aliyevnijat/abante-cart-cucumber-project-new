package com.app.step_definitions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingProductToWishListStepDefs {
	
	HomePage hp = new HomePage();
	LoginPage lp = new LoginPage();
	
	
	@When ("^I logged into AbanteCart Website$")
	public void i_logged_into_AbanteCart_Website() {
		BrowserUtils.hover(hp.accountTop);
		BrowserUtils.waitForVisibility(hp.loginTop, 3);
		hp.loginTop.click();
		lp.loginName.sendKeys("vasif123");
		lp.password.sendKeys("vasif123");
		BrowserUtils.waitFor(2);
		lp.loginButton.click();
	}
		
	@When("^I go to tab Hair Care$")
	public void i_go_to_tab_Hair_Care() {
	   BrowserUtils.hover(hp.HairButton);
	}

	@When("^I choose option Conditioner$")
	public void i_choose_option_Conditioner() {
		BrowserUtils.waitFor(2);
		hp.ConditionerButton.click();
	}

	@When("^I click on the product with name HIGHLIGHTING EXPRESSIONS$")
	public void i_click_on_the_product_with_name_HIGHLIGHTING_EXPRESSIONS() {
	   hp.HighlightingExpressions.click();
	}

	@When("^I press on the option Add to wish list$")
	public void i_press_on_the_option_Add_to_wish_list() {
	    hp.WishListButton.click();
	}

	@When("^I hover over ACCOUNT and press on CHECK YOUR ORDER$")
	public void i_hover_over_ACCOUNT_and_press_on_CHECK_YOUR_ORDER() {
	    BrowserUtils.hover(hp.AccountButton);
	    hp.CheckYourOrderButton.click();
	}

	@When("^I press button My wish list$")
	public void i_press_button_My_wish_list() {
	    hp.MyWishListButton2.click();
	}

	@Then("^I see page MY WISH LIST$")
	public void i_see_page_MY_WISH_LIST() {
	    assertTrue(hp.WishListPage.isDisplayed());
	}

	@Then("^I see product with name HIGHLIGHTING EXPRESSIONS$")
	public void i_see_product_with_name_HIGHLIGHTING_EXPRESSIONS() {
		assertTrue(hp.verifyHighlightingExpressions.isDisplayed());
		hp.TrashCanIcon.click();
	}

	@When("^I click on a trash-can icon$")
	public void i_click_on_a_trash_can_icon() {
	   //
	}

	@Then("^The product gets deleted and I don't see any products in MY WISH LIST$")
	public void the_product_gets_deleted_and_I_don_t_see_any_products_in_MY_WISH_LIST() {
		assertTrue(hp.WishListIsEmpty.isDisplayed());
	}

}
