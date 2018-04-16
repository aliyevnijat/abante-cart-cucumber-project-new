#Author: Ekaterina
@Shavkat
Feature: Adding to and Removing from Wishlist

  Scenario: Adding product to Wish list
  	Given I am on AbanteCart Home Page
    And I logged into AbanteCart Website
    When I go to tab Hair Care
    And I choose option Conditioner
    And I click on the product with name HIGHLIGHTING EXPRESSIONS
    And I press on the option Add to wish list
    When I hover over ACCOUNT and press on CHECK YOUR ORDER
    And I press button My wish list
    Then I see page MY WISH LIST
    And I see product with name HIGHLIGHTING EXPRESSIONS

  Scenario: Deleting product from Wish list
  	Given I am on AbanteCart Home Page
    And I logged into AbanteCart Website
    When I go to tab Hair Care
    And I choose option Conditioner
    And I click on the product with name HIGHLIGHTING EXPRESSIONS
    And I press on the option Add to wish list
    When I hover over ACCOUNT and press on CHECK YOUR ORDER
    And I press button My wish list
    Then I see product with name HIGHLIGHTING EXPRESSIONS
    When I click on a trash-can icon
    Then The product gets deleted and I don't see any products in MY WISH LIST
