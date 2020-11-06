package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    CommonFunctions commonFunctions = new CommonFunctions();

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setDriver() {

        driver.get("https://www.emirates.com/uk/english/");
        commonFunctions.scrollWindow(0,250);
    }

}
