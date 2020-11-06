package stepDefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import pageObjects.DatePicker;
import pageObjects.FromTo;
import pageObjects.HomePage;

public class RoundTripSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    FromTo fromTo = new FromTo(driver);
    DatePicker datePicker = new DatePicker(driver);

    @Given("^I provide the URL$")
    public void i_provide_the_URL() {
        homePage.setDriver();
    }

    @Then("^I should navigate to Home Page$")
    public void i_should_navigate_to_Home_Page() {
        homePage.chckHomepage();

    }

    @When("^I select round trip$")
    public void i_select_round_trip() {
        wait(2);
        fromTo.roundTrip();
    }

    @When("^I select the Origin \"([^\"]*)\"$")
    public void i_select_the_Origin(String originPlace) {

        fromTo.setOriginBox(originPlace);

    }

    @When("^I select the Destination \"([^\"]*)\"$")
    public void i_select_the_Destination(String destiPlace) {
        wait(10);
        fromTo.setDestinationBox(destiPlace);
        // fromTo.setDestination();
    }

    @When("^I select the day of travel \"([^\"]*)\"$")
    public void i_select_the_day_of_travel(String givenDay) {
        datePicker.setDepartDate(givenDay);
    }

    @When("^I select the return day \"([^\"]*)\"$")
    public void i_select_the_return_day(String returnDay) {
       datePicker.setArrivalDate(returnDay);

    }

    @Then("^I should have selected my Schedule$")
    public void i_should_have_selected_my_Schedule() {

    //   datePicker.setFindFlights();

    }


}
