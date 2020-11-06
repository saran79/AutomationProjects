package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
   public WebDriver driver;
public HomePage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div/h2/img")
    WebElement logo;
@FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
    WebElement mobileClick;

        public void openHomePage(){
       driver.get("http://live.demoguru99.com");
        //assert(logo.isDisplayed());
            if ((!logo.isDisplayed())) throw new AssertionError();

            }

    public void setMobileClick() {
            mobileClick.click();
    }
}
