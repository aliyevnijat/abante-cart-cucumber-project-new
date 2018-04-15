package com.app.step_definitions;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.MyAccount;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChangeCurrency {

	HomePage hp = new HomePage();
	MyAccount ma = new MyAccount();
	LoginPage lp = new LoginPage();
	BrowserUtils BR = new BrowserUtils();

	@Given("^I Click Books$")
	public void i_Click_Books() {
		 hp.BOOKS.click();
	}

	 

	@Then("^I verified money icon is \\$$")
	public void i_verified_money_icon_is_$() {
	   
	   System.out.println(ma.dolarIcon.getText().contains("$"));
	}

	@Then("^I hover overed to currency dropdown menu$")
	public void i_hover_overed_to_currency_dropdown_menu() {
		 BrowserUtils.waitFor(5);
		BR.hover(ma.moneyselect);
	 }
  
	@Then("^I verified money icon is changed to \"([^\"]*)\"$")
	public void i_verified_money_icon_is_changed_to(String arg1) {
	    ma.dolarIcon.getText().contains("£");
	}

	 

	@Then("^I changed it to pound sterling$")
	public void i_changed_it_to_pound_sterling() {
	    ma.dolarIcon.getText().contains("€");
	}


}
