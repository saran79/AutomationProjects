Feature: Guardian feature - Update

  @Guardian
   Scenario: Validate Guardian update page
    Given I'm on the Home page
    When I enter username and password
      | admin@coaching.com | 22091671 |
    And I enter Login
    And user should be able to login
    When I am on the Dashboard Page
    And I click on the Guardians Menu
    And Select All Guardians
    And I select the Guardian with  Name as "Selenium Java" and click Action
    And I select Edit option
    And I Navigate to the update Guardian's Page
    And I enter FirstName as "" and LastName as ""
    And I click on the update Guardian button
    Then I should be able to update the Guardian successfully