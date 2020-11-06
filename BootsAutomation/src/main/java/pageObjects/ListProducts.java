package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListProducts extends CommonFunctions {

    public ListProducts(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="//a[contains(text(),'Boots Essentials Tissues 2ply Box 150')]")
    WebElement productLink;

    public void setProductLink() {
        wait(20);
        productLink.click();
    }
}