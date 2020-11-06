package pageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuardianUpdatePage {

    WebDriver driver;
    CommonFunctions commonFunctions = new CommonFunctions();
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[7]/a[1]/i[2]")
    WebElement guardian;
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")
    WebElement allGuardians;
    @FindBy(xpath="//label[contains(text(),'Selenium Java')]")
    WebElement guardianName;
    @FindBy(xpath="//tbody/tr[7]/td[5]/div[1]/button[1]")
    WebElement clkAction;

    public GuardianUpdatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clkGuardianPage() {
        guardian.click();
    }

    public void clkAllGuardians() {
        allGuardians.click();
    }


    public void selectAndClickEdit(String guarName) {
        commonFunctions.wait(5);
       String name =  guardianName.getText();
        if (name.equals(guarName))
         {

            clkAction.click();
        }

    }
}
