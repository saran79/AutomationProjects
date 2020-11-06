package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetails {
    @FindBy(name = "")
    WebElement fitOption;

    @FindBy(name = "")
    WebElement sizeOption;

    @FindBy(name = "")
    WebElement addToBagBtn;

    public void setFitOption(String fitOptionVal) {
        new Select(fitOption).selectByVisibleText(fitOptionVal);
    }

    public void setSizeOption(String sizeOptionVal){
        new Select(sizeOption).selectByVisibleText(sizeOptionVal);

    }

    public void setAddToBagBtn() {
        addToBagBtn.click();
    }
}
