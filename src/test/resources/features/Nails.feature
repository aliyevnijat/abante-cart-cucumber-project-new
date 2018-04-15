#Author Bilal

Feature: Nails

 @Sha @jenkins
  Scenario: Buy Nail Product 
    Given I am on AbanteCart Home Page
    When I hover over the "MAKEUP"
    Then following menu options should be visible:
      | Cheeks	   |
      | Eyes      |
      | Face      |
      | Lips      |
      | Nails     |
      | Value Sets|
      
    Then I should be able to choose "Nails"
    Then I should be able to choose "FLUID SHINE NAIL POLISH"
    Then Verify the Pirce is "$137"
    When I click on the add to cart button
    Then I should be able to Choose Country "United States"
    And I choose City "Illinois"
    And I type Zipcode "60018"
    Then Click on the Continue Shopping 
		
	
     Scenario: Verify View and Write Rewiev is visible
    Given I am on AbanteCart Home Page
    When I hover over the "SKIN CARE"
    Then following menu options should be visible:
      
      | Eyes             |
      | Face             |
      | Gift ideas & Sets|
      |  Hands & Nails   |
      | Sun              |
      
    And I click on the "SUN"
    Then I should be able to  click on the "Flash Bronzer Body Gel" link
    Then Price should be visible "$29"
    