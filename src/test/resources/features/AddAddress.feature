#Author: Muhammet Koklu
Feature: Count Add Address
@Shavkat 
  Scenario: Add New Address
  
    Given I am on AbanteCart Home Page
    Then I hover over Account and click on Loginn
    And I Enter Login name "vasif123" and password "vasif123" and verify main text equals "MY ACCOUNT"
    And Click Manage Address Book
    
    And Click to New Address
    And Write "David" as a first name
    And Write "Silva" as a Last Name
    And Write "Orange" as a Company
    And Write  "683 North" as a Address1
    And Write "Merge" as a City
    And Select "New York" as a Region/State
    And Write "11223" as a Zip / Post Code
    When I click to continue
    Then I should displayed  "Your address has been successfully inserted"
@Shavkat
  Scenario Outline: Add Multiple New Address
   Given I am on AbanteCart Home Page
   Then I hover over Account and click on Login
   Then I hover over Account and click on Login
   And Click Manage Address Book
   And Click to New Address
   And Write "<firstname>" as a first name
   And Write "<lastname>" as a Last Name
   And Write "<Company>" as a Company
   And Write  "<Address1>" as a Address1
   And Write "<city>" as a City
   And Select "<Region/State>" as a Region/State
   And Write "<Zip/PostCode>" as a Zip / Post Code 
   When I click to continue
   Then I should displayed  "Your address has been successfully inserted"
   Then I count how many address there is in manage address book page

    Examples: 
      | firstname | lastname | Company | Address1 | city       | Region/State | Zip/PostCode |
      | Satoshi   | Nakamuro | Orange  | Block    | westfielsd | New jersey   |        05042 |
      | John      | Smith    | thefect | Central  | eastfield  | Florida      |        07032 |
      | Rajesh    | Trewedi  | micro   | North    | Life       | New York     |       024521 |
      | Bonnie    | Garcia   | Mymazon | East     | Carlstad   | Virginia     |        29395 |


