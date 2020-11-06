package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage {
    @FindBy(name="")
    WebElement bagText;

    @FindBy(name="")
    WebElement viewEditBagBtn;

    @FindBy(name="")
    WebElement checkOutBtn;

    @FindBy(name="")
    WebElement productInBag;

    public void validateBagText() {
        Assert.assertTrue(bagText.isDisplayed());
    }
    public void clickEditBagBtn() {
        viewEditBagBtn.click();
    }

    public void validateProdInBag(String productName) {
         String actualProduct = productInBag.getText();
         Assert.assertEquals(productName, actualProduct);
    }

    public void clickCheckOutBtn(){
        checkOutBtn.click();
    }

}
