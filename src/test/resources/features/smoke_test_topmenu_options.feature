Feature: 

  Background: 
    Given I am on AbanteCart Home Page



  @test @jenkins
  Scenario: 
    When I hover over Home menu button
    Then Following menu options shoul be visible for Home menu
      | Specials |
      | Account  |
      | Cart     |
      | Checkout |

  @test @jenkins
  Scenario: 
    When I hover over Apparel & Accessories menu button
    Then Following menu options shoul be visible for Apparel & Accessories:
      | Shoes    |
      | T-shirts |

  @test @jenkins
  Scenario: 
    When I hover over MAKEUP menu button
    Then Following menu options shoul be visible for MAKEUP:
      | Cheeks     |
      | Eyes       |
      | Face       |
      | Lips       |
      | Nails      |
      | Value Sets |

  @test @jenkins
  Scenario: 
    When I hover over SKINCARE menu button
    Then Following menu options shoul be visible for SKINCARE:
      | Eyes              |
      | Face              |
      | Gift Ideas & Sets |
      | Hands & Nails     |
      | Sun               |

  @test @jenkins
  Scenario: 
    When I hover over FRAGRANCE menu button
    Then Following menu options shoul be visible for FRAGRANCE:
      | Men   |
      | Women |

  @test @jenkins
  Scenario: 
    When I hover over MEN menu button
    Then Following menu options shoul be visible for MEN:
      | Body & Shower       |
      | Fragrance Sets      |
      | Pre-Shave & Shaving |
      | Skincare            |

  @test @jenkins
  Scenario: 
    When I hover over HAIR CARE menu button
    Then Following menu options shoul be visible for HAIR CARE:
      | Conditioner |
      | Shampoo     |

  @test @jenkins
  Scenario: 
    When I hover over BOOKS menu button
    Then Following menu options shoul be visible for BOOKS:
      | Audio CD  |
      | Paperback |
