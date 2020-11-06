package stepDefnitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps  extends CommonFunctions{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage= new LoginPage(driver);

    @Given("^I'm on the Home Page$")
    public void i_m_on_the_Home_Page()  {
        System.out.println("driver started");
        driver.get("https://www.britishairways.com/travel/home/public/en_in/");
    }

    @When("^I click Login$")
    public void i_click_Login()  {
        homePage.clickMyAccountLink();
    }


    @When("^I enter Email address \"([^\"]*)\"$")
    public void i_enter_Email_address(String userEmail)  {
        loginPage.enterEmail(userEmail);
        
    }

    @When("^I enter Password \"([^\"]*)\"$")
    public void i_enter_Password(String userPassword)  {
        loginPage.enterPassword(userPassword);
    }

    @When("^I click Login Button$")
    public void i_click_Login_Button()  {
        loginPage.clkLoginBtn();
        //wait(25);
     
    }

    @Then("^I should Login$")
    public void i_should_Login()  {
       loginPage.clkLogin();
    }

}
