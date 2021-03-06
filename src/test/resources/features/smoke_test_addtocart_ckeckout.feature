#Author: Nijat

Feature: Log in, Add to Cart, Check Out
@smoke_test  @jenkins
  Scenario: I log in, add multiple items to cart and check out
    Given I am on AbanteCart Home Page
    Then I hover over Account and click on Login
    And I Enter Login name "vasif123" and password "vasif123" and verify main text equals "MY ACCOUNT"
    Then I HoverOver Apparel & accessories and click T-shirts and verify main text equals  "T-SHIRTS"
    Then I click on  Fruit of the Loom T-Shirts 5 Pack - Super Premium and add to card
    And I verify that displayed total price equals "12.84"
    Then I continue shopping
    And I click on Mens Fine Cotton Giraffe Polo Shirts and add to card
    Then I verify that displayed total price equals "35.62"
    Then I click checkout and confirm order and verify main text equals "YOUR ORDER HAS BEEN PROCESSED!"

  
  Scenario Outline: 
    Given I am on AbanteCart Home Page
    Then I hover over Account and click on Login
    And I Enter Login name "<logInName>" and password "<password>" and verify main text equals "MY ACCOUNT"
    Then I HoverOver Apparel & accessories and click T-shirts and verify main text equals  "T-SHIRTS"
    Then I click on  Fruit of the Loom T-Shirts 5 Pack - Super Premium and add to card
    And I verify that displayed total price equals "12.84"
    Then I continue shopping
    And I click on Mens Fine Cotton Giraffe Polo Shirts and add to card
    Then I verify that displayed total price equals "35.62"
    Then I click checkout and confirm order and verify main text equals "YOUR ORDER HAS BEEN PROCESSED!"

    Examples: 
      | logInName | password |
      #| azat123   | azat123  |
      #| jason123  | jason123 |
      #| dow123    | dow123   |
