#noinspection CucumberUndefinedStep,CucumberUndefinedStep,CucumberUndefinedStep,CucumberUndefinedStep,CucumberUndefinedStep,CucumberUndefinedStep
Feature: As a user
          I should Login

  Scenario: Validate login with valid data

    Given I'm on the Home Page
    When  I click myAccount Link
    When I enter userName "GeorgeBest@xyz.com"
    When I enter password "George£$%"
    When I click Login button
    Then I Should Login