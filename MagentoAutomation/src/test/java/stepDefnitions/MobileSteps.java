package stepDefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HomePage;
import pageObjects.MobilePage;

public class MobileSteps  extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    MobilePage mobilePage = new MobilePage(driver);


    @Given("^I am on the Home Page$")
    public void i_am_on_the_Home_Page()  {
    homePage.openHomePage();
        }

    @When("^I click on Mobile link$")
    public void i_click_on_Mobile_link()  {
        homePage.setMobileClick();
        }

    @Then("^I should be able to navigate to Mobile page$")
    public void i_should_be_able_to_navigate_to_Mobile_page()  {
        System.out.println("Mobile page");
        }

    @Given("^I am on the Mobile Page$")
    public void i_am_on_the_Mobile_Page()  {
        mobilePage.setMobileLogo();
        }

    @When("^I click sort by drop down by\"([^\"]*)\"$")
    public void i_click_sort_by_drop_down_by(String sortName) {
          wait(5);
           mobilePage.setSelectList(sortName);
        }

    @Then("^I should see the sorted List$")
    public void i_should_see_the_sorted_List()  {
        mobilePage.setAscDirection();
        }

}
