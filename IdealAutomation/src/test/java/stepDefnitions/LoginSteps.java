package stepDefnitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.HomePage;


public class LoginSteps extends CommonFunctions {


    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("^I'm on the Home page$")
    public void i_m_on_the_Home_page() {
        homePage.setHomePage();
    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password(DataTable loginTable) {
        loginPage.setUserNameAndPassword(loginTable);
    }

    @When("^I enter Login$")
    public void i_enter_Login() {
        loginPage.setLoginBtn();
        wait(5);
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() {
    }

}
