Feature: As a User
         I should Login

  Scenario: Validate Login with Valid data

    Given I'm on the Home Page
    When I click Login
    When I enter Email address "suji.kool@gmail.com"
    When I enter Password "Manutd!"
    When I click Login Button
    Then I should Login

  Scenario: Validate Login with Invalid data

    Given I'm on the Home Page
    When I click Login
    When I enter Email address "suji.kasl@gmail.com"
    When I enter Password "Manssdutd!"
    When I click Login Button
    Then I should not be able to Login


