package stepDefnitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);

    LoginPage loginPage = new LoginPage(driver);

    @Given("I'm on the Home Page")
    public void i_m_on_the_home_page() throws Exception{
       // driver.get(readPropertyFiles("url"));
        driver.get("http://www.next.co.uk");
        wait(20);
    }

    @When("I click myAccount Link")
    public void i_click_my_account_link() {
        homePage.clickMyAccountLink();
    }

    @When("I enter userName {string}")
    public void i_enter_user_name(String userNamVal) {
        wait(5);
        loginPage.enterUserName(userNamVal);
    }

    @When("I enter password {string}")
    public void i_enter_password(String userPasswordVal) {
        loginPage.enterUserPassword(userPasswordVal);
    }


    @When("I click Login button")
    public void i_click_login_button() {
        loginPage.clickLoginBtn();
    }

    @Then("I Should Login")
    public void i_should_login() {
        loginPage.findErrMsg("Please check your sign in details are correct and try again.");

    }

}

