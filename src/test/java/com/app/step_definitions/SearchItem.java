package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.HomePage;
import com.app.pages.MyAccount;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItem {
	HomePage hp = new HomePage();
	MyAccount ma = new MyAccount();
	

@When("^I enter \"([^\"]*)\"$")
public void i_enter(String shoe) {
	BrowserUtils.waitFor(4);
	hp.searchkeyword.sendKeys(shoe);  
}

@When("^I	click Search$")
public void i_click_Search() {
	BrowserUtils.waitFor(4);
	hp.searchkeyword.click();
}

@Then("^Multiple results are shown for shoes\\.$")
public void multiple_results_are_shown_for_shoes() {
	BrowserUtils.waitFor(4);
	assertTrue(hp.blackshoes.isDisplayed());
	assertTrue(hp.redshoes.isDisplayed());
	assertTrue(hp.purpelshoes.isDisplayed());
	assertTrue(hp.greyshoes.isDisplayed());
	
	
	
}}
