Feature: As a user I should be
         able to select list of mobiles by name

  Scenario: Navigate to  the Mobile page
    Given I am on the Home Page
    When  I click on Mobile link
    Then I should be able to navigate to Mobile page

    Given I am on the Mobile Page
    When I click sort by drop down by "Name"
    Then I should see the sorted List


