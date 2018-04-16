package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.pages.MyAccount;
import com.app.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAdress {

	
	HomePage hp = new HomePage();
	MyAccount ma = new MyAccount();
	LoginPage lp = new LoginPage();
	BrowserUtils BR = new BrowserUtils();
	 
	
	@Then("^I hover over Account and click on Loginn$")
	public void i_hover_over_Account_and_click_on_Login() {
	    BrowserUtils.hover(hp.accountTop);
	    hp.loginTop.click();
	}
	
	
	@Then("^Click Manage Address Book$")
	public void click_Manage_Address_Book() {
	    ma.myAccount.click();
	}

 

	@Then("^Click to New Address$")
	public void click_to_New_Address() {
	   ma.NewAddress.click();
	}

	@Then("^Write \"([^\"]*)\" as a first name$")
	public void write_as_a_first_name(String arg1) {
	  ma.FirstName.sendKeys("David");
		
	}

	@Then("^Write \"([^\"]*)\" as a Last Name$")
	public void write_as_a_Last_Name(String arg1) {
	  ma.LastName.sendKeys("Silva");
	}

	@Then("^Write \"([^\"]*)\" as a Company$")
	public void write_as_a_Company(String arg1) {
	     ma.company.sendKeys("orange");
	}

	@Then("^Write  \"([^\"]*)\" as a Address(\\d+)$")
	public void write_as_a_Address(String arg1, int arg2) {
	  ma.Address1.sendKeys("683 North");
	}

	@Then("^Write \"([^\"]*)\" as a City$")
	public void write_as_a_City(String arg1) {
	   ma.City.sendKeys("Merge");
	}

	@Then("^Select \"([^\"]*)\" as a Region/State$")
	public void select_as_a_Region_State(String arg1) {
		ma.CountryId.click();
		BR.Selects(ma.Region, "New York");
	}

	@Then("^Write \"([^\"]*)\" as a Zip / Post Code$")
	public void write_as_a_Zip_Post_Code(String arg1) {
	    ma.CountryId.sendKeys("11223");
	}

	@When("^I click to continue$")
	public void i_click_to_continue() {
	     ma.ContinueButton.click();
	}

	@Then("^I should displayed  \"([^\"]*)\"$")
	public void i_should_displayed(String arg1) {
		 assertTrue(hp.alertSuccess.isDisplayed());
	}
 
	@Then("^I count how many address there is in manage address book page$")
	public void i_count_how_many_address_there_is_in_manage_address_book_page() {
	    System.out.println(ma.addressBookAddres.size());
	}
	
	
	
}


