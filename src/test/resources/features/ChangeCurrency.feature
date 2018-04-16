#Author: Muhammet Koklu
@Shavkat
Feature: Change Currency

  Scenario: Change Dollar to Pound Sterling
    Given I am on AbanteCart Home Page
    And I Click Books
    Then I verified money icon is $
    And I hover overed to currency dropdown menu  
    Then I verified money icon is changed to "£"

  Scenario: Change Dollar to Euro
  
    Given I am on AbanteCart Home Page
    And I Click Books
   	Then I verified money icon is $
    And I hover overed to currency dropdown menu 
    Then I verified money icon is changed to "€"
