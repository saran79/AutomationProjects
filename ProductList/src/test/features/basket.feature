Feature:As a user
        I should be able to add product in the basket
  Scenario: Validate adding single product to the basket

    Given   I'm on the Homepage
    When    I Search for product "Five pocket Jeans"
    When  I choose a product "Five pocket Jeans"
    When I provide Size "7-8"
    When I click add to Bag Button
    Then The product "Five Pocket Jeans" should be in the basket

