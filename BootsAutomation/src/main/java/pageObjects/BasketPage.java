package pageObjects;

import functionsLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;

public class BasketPage {
    CommonFunctions commonFunctions = new CommonFunctions();
    public BasketPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//span[contains(text(),'View basket & checkout')]")
    WebElement viewBagBtn;

    @FindBy(xpath="//*[@id=\"MiniShopCartProdName_1560474095\"]")
    WebElement productInBag;

    public void setViewBagBtn() {
        viewBagBtn.click();
    }

    public void validateProductInBag(String productName){
        commonFunctions.wait(10);
        String actualProduct = productInBag.getText();
        System.out.println(actualProduct);
        Assert.assertEquals(productName, actualProduct);
        // //*[@id="MiniShopCartProdName_1560474095"]

    }
}


