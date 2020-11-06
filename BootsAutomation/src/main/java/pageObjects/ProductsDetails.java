package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsDetails {

    public ProductsDetails(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="//div[@id='productPageAdd2Cart']")
    WebElement addToBasket;

    public void setAddToBasket() {
        addToBasket.click();
    }
}
