Feature: As a user I should
          login

  Scenario: navigate to home page
    Given I provide the URL
    Then I should navigate to Home Page


    When I select round trip
    When I select the Origin "Chennai (MAA)"
    When I select the Destination " Delhi (DEL)"
    When I select the day of travel "26-December-2020"
    When I select the return day "26-January-2021"
    Then I should have selected my Schedule

