package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlacePicker {

    CommonFunctions commonFunctions = new CommonFunctions();
    WebDriver driver;
    public PlacePicker(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFromPort( String fromPort){
        commonFunctions.wait(2);
        driver.findElement(By.name("Departure airport")).sendKeys(fromPort);
    }
    public void setToPort( String toPort){
        driver.findElement(By.name("Arrival airport")).sendKeys(toPort);
        commonFunctions.scrollWindow(0,450);
        commonFunctions.wait(3);
    }

}


