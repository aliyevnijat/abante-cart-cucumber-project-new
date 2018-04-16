#Athor: Maria
@Shavkat
Feature: Search Item

#	Home Page
  #In order to test Home Page of application
  # As a Registered user
  # I want to specify the features of home page
  
  Scenario: Search item in a Search Keywords box
    Given I am on AbanteCart Home Page
    When I enter "shoes"
    When I click Search
    Then Multiple results are shown for shoes.