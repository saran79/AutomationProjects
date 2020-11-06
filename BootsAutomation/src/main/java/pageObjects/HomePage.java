package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(WebDriver driver){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath="//div[@id='logo']//a//img")
    WebElement logo;

    @FindBy(id="AlgoliaSearchInput")
    WebElement searchTxtFld;

    @FindBy(id="algolia-search-button")
    WebElement searchIcon;

    @FindBy(xpath="//a[@id='widget_minishopcart']")
    WebElement basketIcon;

    @FindBy(xpath="//span[contains(text(),'Log in')]")
    WebElement myAccountLink;

    public void validateLogo() {
             Assert.assertTrue(logo.isDisplayed());
         }

    public void enterSearchTerm(String searchTerm) {
        searchTxtFld.sendKeys(searchTerm);

    }

    public void clickSearchIcon() {
        searchIcon.click();

    }



}
