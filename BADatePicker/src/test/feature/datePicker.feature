Feature: As a user I should
        select a journey

  Scenario: Validate the journey
    Given When I Navigate to the Home Page
    When I enter the departure port "LHR"
    When I enter the  Arrival port "MAA"
    When I select the Outbound date "27-November-2020"
    When I select the Inbound date "30"
    Then I should  see my Schedule



