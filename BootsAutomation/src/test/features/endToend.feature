Feature: As a user
        I should be able to purchase and make payments
  Scenario: Validate user  adding an item to the basket and Checkout

    Given I am on the HomePage
    When I search for product "Tissue"
    When I choose the product "Boots Essentials Tissues 2ply Box 150"
    When I click Add to basket
    Then I click View Basket and check out Button
    Then I click the Checkout Button


      When I  give email address and Password
      When I click Login Button
      Then I should be able to login





