import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
                  tags={},
                    dryRun = false,
                    strict = true)
public class Run {
}

/*
 Scenario: Navigate to  the Mobile page
    Given I am on the Home Page
    When  I click on Mobile link
    Then I should be able to navigate to Mobile page

    Given I am on the Mobile Page
    When I click sort by drop down by "Price"
    Then I should see the sorted List

  Scenario: Navigate to  the Mobile page
    Given I am on the Home Page
    When  I click on Mobile link
    Then I should be able to navigate to Mobile page

    Given I am on the Mobile Page
    When I click sort by drop down by "Position"
    Then I should see the sorted List

 */