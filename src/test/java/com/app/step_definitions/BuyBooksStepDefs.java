package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.MyAccount;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Configuration;

import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BuyBooksStepDefs {
	HomePage hp = new HomePage();
	MyAccount ma = new MyAccount();
	LoginPage lp = new LoginPage();
	BrowserUtils BR = new BrowserUtils();


	@Given("^I hover over books and click audio CD$")
	public void i_hover_over_books_and_click_audio_CD() {
		BrowserUtils.waitFor(5);
		BrowserUtils.hover(hp.BOOKS);
		BrowserUtils.waitFor(5);
	    hp.AudioCD.click();
	}

	@Given("^I click sort by Rating Highest$")
	public void i_click_sort_by_Rating_Highest() {
	    hp.sortDropDown.click();
	    hp.RatingHighest.click();
	}

	@Given("^I click on New French With Ease title$")
	public void i_click_on_New_French_With_Ease_title() {
	    hp.NewFrenchWith.click();
	}

	@Given("^Iclick add to cart$")
	public void iclick_add_to_cart() {
	   hp.AddtoCart.click();
	}

	@Then("^I enter quantity as (\\d+)$")
	public void i_enter_quantity_as(int arg1) {
		BrowserUtils.waitFor(2);
		hp.Quantity.clear();
		hp.Quantity.sendKeys("3");
	   
	}

	@Then("^I click Update$")
	public void i_click_Update() {
	    hp.Update.click();
	}

	@Then("^I click Country and State and choose Andorra$")
	public void i_click_Country_and_State_and_choose_Andorra() {
	    BR.Selects(hp.Country, "Andorra");
	    
	}

	@Then("^I click Please Select and choose Ordino$")
	public void i_click_Please_Select_and_choose_Ordino() {
		BR.Selects(hp.State,"Ordino");
	}

	@Then("^I input ZIP \"([^\"]*)\"$")
	public void i_input_ZIP(String arg1) {
	    hp.ZIPPostCode.sendKeys("21215");
	}

	@Then("^I click Checkout$")
	public void i_click_Checkout() {
		BrowserUtils.waitFor(5);
	    hp.checkout2.click();
	}

	@Then("^I click Confirm Order$")
	public void i_click_Confirm_Order() {
		hp.confirmOrder.click();  
	
		
	}
	
	
	@Then("^I click on Account$")
	public void i_click_on_Account() {
		hp.accountTop.click();
		BrowserUtils.waitFor(5);
		lp.loginName.sendKeys("admin");
		lp.password.sendKeys("abc123");
		lp.loginButton.click();
		
	}

	
	@Then("^I click Edit account details$")
	public void i_click_Edit_account_details() {
	    hp.EditAccount.click();;
	}

	@Then("^I set First Name as \"([^\"]*)\"$")
	public void i_set_First_Name_as(String arg1) {
		BrowserUtils.waitFor(2);
	   hp.firstName.clear();
	   hp.firstName.sendKeys(arg1);
	}

	@Then("^I set Last Name as \"([^\"]*)\"$")
	public void i_set_Last_Name_as(String arg1) {
		BrowserUtils.waitFor(2);
	    hp.lastname.clear();
	    hp.lastname.sendKeys(arg1);
	}

	@Then("^I set E-Mail as \"([^\"]*)\"$")
	public void i_set_E_Mail_as(String arg1) {
		BrowserUtils.waitFor(2);
	   hp.email.clear();
	   hp.email.sendKeys(arg1);
	}

	@Then("^I set Telephone as \"([^\"]*)\"$")
	public void i_set_Telephone_as(String arg1) {
		BrowserUtils.waitFor(2);
	   hp.telephone.clear();
	   hp.telephone.sendKeys(arg1);
	}

	@Then("^I set Fax as \"([^\"]*)\"$")
	public void i_set_Fax_as(String arg1) {
		BrowserUtils.waitFor(2);
		hp.fax.clear();
		hp.fax.sendKeys(arg1);
	}

	@Then("^I click Continue$")
	public void i_click_Continue() {
		hp.continuepage.click();
		
	   
	}

	@Then("^I see message displayed - Success: Your account has been successfully updated$")
	public void i_see_message_displayed_Success_Your_account_has_been_successfully_updated() {
	  assertTrue(hp.alertSuccess.isDisplayed());
	}



}
