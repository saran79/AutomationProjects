package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import pageObjects.DatePicker;
import pageObjects.HomePage;
import pageObjects.PlacePicker;

public class DatePickerSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    PlacePicker placePicker = new PlacePicker(driver);
    DatePicker datePicker = new DatePicker(driver);

    @Given("^When I Navigate to the Home Page$")
    public void when_I_Navigate_to_the_Home_Page() {
        homePage.setDriver();
    }

    @When("^I enter the departure port \"([^\"]*)\"$")
    public void i_enter_the_departure_port(String strFromPort) {
        placePicker.setFromPort(strFromPort);
    }

    @When("^I enter the  Arrival port \"([^\"]*)\"$")
    public void i_enter_the_Arrival_port(String strToPort) {
        placePicker.setToPort(strToPort);
    }

    @When("^I select the Outbound date \"([^\"]*)\"$")
    public void i_select_the_Outbound_date(String strOutDate) {
        datePicker.setOutboundDate(strOutDate);

    }

    @When("^I select the Inbound date \"([^\"]*)\"$")
    public void i_select_the_Inbound_date(String arg1) {
    }

    @Then("^I should  see my Schedule$")
    public void i_should_see_my_Schedule() {
    }

}
