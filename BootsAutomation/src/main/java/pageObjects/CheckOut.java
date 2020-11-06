package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
    CommonFunctions commonFunctions = new CommonFunctions();
    public CheckOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@id='basket_top_checkout']/div")
    WebElement checkOutBtn;
    public void clickCheckOut(){
      checkOutBtn.click();
        commonFunctions.wait(10);
    }
}
