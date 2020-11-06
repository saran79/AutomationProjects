package pageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath="/html/body/div[1]/div/div/div/div[2]/div/div[1]")
    WebElement logo;

    public void setHomePage() {
        driver.get("http://demo.dontonno.com/cms-test-v3/");
        new CommonFunctions().wait(5);
        assert(logo.isDisplayed());
    }
}
