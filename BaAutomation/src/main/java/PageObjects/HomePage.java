package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public  HomePage (WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath="//ul[@class='clearfix header-items ng-scope']//span[@class='login ng-binding ng-scope ng-isolate-scope'][contains(text(),'Log in')]")
    WebElement myAccountLink;

    public void clickMyAccountLink(){
        myAccountLink.click();
    }

}
