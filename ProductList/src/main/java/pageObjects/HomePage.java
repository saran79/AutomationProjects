package pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy (name="")
    WebElement logo;

    @FindBy (name="")
    WebElement searchTxtFld;

    @FindBy (name="")
    WebElement searchIcon;

    @FindBy (name="")
    WebElement helpLink;

    @FindBy (name="")
    WebElement basketIcon;

    //@FindBy(xpath = "/html/body/header/div/section/section[2]/ul/li[1]/a")
    @FindBy(xpath="//a[contains(text(),'My Account')]")
    WebElement myAccountLink;

    public void validateLogo() {
        Assert.assertTrue(logo.isDisplayed());
    }
    public void enterSearchTerm(String searchTerm){
        searchTxtFld.sendKeys(searchTerm);

    }
public  void clickSearchIcon(){
        searchIcon.click();

}

public void clickHelpLink(){
        helpLink.click();
}
public void clickBasketLink() {
        basketIcon.click();
}
    public void clickMyAccountLink() {

        myAccountLink.click();
    }
}