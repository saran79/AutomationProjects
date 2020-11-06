package pageObjects;

import org.apache.hc.core5.http2.frame.StreamIdGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ListProducts {

    @FindBy(name="")
    WebElement sortOption;
    @FindBy(name="")
    WebElement  productLink;

    public void selectSortOption(String sortOptionVal){
        new Select(sortOption).selectByVisibleText(sortOptionVal);
    }

    public void setProductLink() {
        productLink.click();
    }
}
