Feature: As a User I
         should Login

  Scenario: Validate login functionality
    Given I'm on the Home page
    When I enter username and password
    | admin@coaching.com | 22091671 |
    When I enter Login
    Then user should be able to login
