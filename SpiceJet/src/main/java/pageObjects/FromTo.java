package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FromTo {
    WebDriver driver;
    CommonFunctions commonFunctions = new CommonFunctions();

    public FromTo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")
    WebElement originBox;

    public void roundTrip() {
        commonFunctions.wait(3);
        WebElement radio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
        radio.click();
    }

    public void setOriginBox(String orig) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", originBox);


        driver.findElement(By.xpath("//a[contains(text(),'" + orig + "')]")).click();
    }

    public void setDestinationBox(String dest) {

        driver.findElement(By.xpath("//a[contains(text(),'" + dest + "')]")).click();
    }


}
