package pageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobilePage {

    CommonFunctions commonFunctions = new CommonFunctions();

 public MobilePage(WebDriver driver) {
     PageFactory.initElements(driver, this);
 }
@FindBy(xpath="//h1")
    WebElement mobileLogo;

@FindBy(xpath="//select[@title='Sort By']/option[@value=\"http://live.demoguru99.com/index.php/mobile.html?dir=asc&order=name\"]")
    WebElement selectList;
//@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select/option[2]")
//    WebElement selectListOption;
@FindBy(linkText = "Set Descending Direction")
    WebElement ascDirection;

    public void setMobileLogo() {

        if ((!mobileLogo.isDisplayed())) throw new AssertionError();
    }

    public void setSelectList(String selectList1) {
     //  selectList.click();
     // commonFunctions.wait(5);
      // selectListOption.click();
     //   selectList.findElement(By.partialLinkText(selectList1)).click();
        //new Select(selectList).selectByValue(selectList1);
    }

    public void setAscDirection() {
        assert(ascDirection.isDisplayed());
    }
}
