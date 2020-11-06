package pageObjects;

import functionsLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
           WebDriver driver;
           CommonFunctions commonFunctions = new CommonFunctions();
        public HomePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        public void setDriver() {
            driver.get("https://www.spicejet.com/");
        }
        @FindBy(xpath="//a[@class='spicejet_logo']")
        WebElement logo;

        public void chckHomepage(){
            commonFunctions.wait(10);
            Assert.assertTrue(logo.isDisplayed());
            System.out.println("logo displayed");

        }


    }



