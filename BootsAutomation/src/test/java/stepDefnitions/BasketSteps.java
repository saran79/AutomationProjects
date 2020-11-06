package stepDefnitions;

import functionsLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;

public class BasketSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    ListProducts listProducts = new ListProducts(driver);
    ProductsDetails productsDetails = new ProductsDetails(driver);
    BasketPage basketPage = new BasketPage(driver);
    CheckOut checkOut = new CheckOut(driver);


    @Given("I am on the HomePage")

    public void i_am_on_the_home_page() {
        driver.get("http://www.boots.com");
        homePage.validateLogo();

}

    @When("I search for product {string}")
    public void i_search_for_product(String searchVal) {
        homePage.enterSearchTerm(searchVal);
        homePage.clickSearchIcon();
}
    @When("I choose the product {string}")
    public void i_choose_the_product(String productVal) {
        listProducts.setProductLink();
}
    @When("I click Add to basket")
    public void i_click_add_to_basket() {
        productsDetails.setAddToBasket();
}
  //  @Then("the product {string} should be in the basket")
  //  public void the_product_should_be_in_the_basket(String productName) {
   //     basketPage.validateProductInBag(productName);
  //}
    @Then("I click View Basket and check out Button")
    public void i_click_view_basket_and_check_out_button() {
        basketPage.setViewBagBtn();
}
    @Then("I click the Checkout Button")
    public void i_click_the_checkout_button() {
         checkOut.clickCheckOut();

}

}

