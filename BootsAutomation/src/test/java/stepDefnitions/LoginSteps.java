package stepDefnitions;

import functionsLibrary.CommonFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.LoginPage;

import java.util.Collections;
import java.util.List;

public class LoginSteps extends CommonFunctions {

     LoginPage loginPage = new LoginPage(driver);

    @When("I  give email address and Password")
    public void i_give_email_address_and_password() throws Exception{

        loginPage.enterUsernameAndPassword();
    }
    @When("I click Login Button")
    public void i_click_login_button() {
        loginPage.setLoginClick();
        wait(10);
}
    @Then("I should be able to login")
    public void i_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
}

    
}
