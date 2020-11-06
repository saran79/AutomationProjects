package stepDefnitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.GuardianUpdatePage;

import java.rmi.activation.ActivationGroupDesc;

public class GuardianUpdateSteps extends CommonFunctions {

    GuardianUpdatePage guardianUpdatePage = new GuardianUpdatePage(driver);
    
    @When("^I am on the Dashboard Page$")
    public void i_am_on_the_Dashboard_Page() {
    }

    @When("^I click on the Guardians Menu$")
    public void i_click_on_the_Guardians_Menu() {
        guardianUpdatePage.clkGuardianPage();
    }

    @When("^Select All Guardians$")
    public void select_All_Guardians() {
        guardianUpdatePage.clkAllGuardians();
       
    }

    @When("^I select the Guardian with  Name as \"([^\"]*)\" and click Action$")
    public void i_select_the_Guardian_with_Name_as_and_click_Action(String fullName)  {
         guardianUpdatePage.selectAndClickEdit(fullName);
       
    }

    @When("^I select Edit option$")
    public void i_select_Edit_option() {
       
    }

    @When("^I Navigate to the update Guardian's Page$")
    public void i_Navigate_to_the_update_Guardian_s_Page() {
       
    }

    @When("^I enter FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
    public void i_enter_FirstName_as_and_LastName_as(String arg1, String arg2) {
       
    }

    @When("^I click on the update Guardian button$")
    public void i_click_on_the_update_Guardian_button() {
       
    }

    @Then("^I should be able to update the Guardian successfully$")
    public void i_should_be_able_to_update_the_Guardian_successfully() {
       
    }

}
