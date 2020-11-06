package PageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public  LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(id="loginid")
    WebElement userTxtFld;

    @FindBy(id ="password")
    WebElement passwordTxtFld;

    @FindBy(xpath="//*[@id=\"navLoginForm\"]/button")
    WebElement loginBtn;

    public void enterEmail(String userEmail){
        userTxtFld.sendKeys(userEmail);
    }
    public void enterPassword(String userPassword){
        passwordTxtFld.sendKeys(userPassword);
    }
    public void clkLoginBtn(){
        loginBtn.click();

    }
    public void clkLogin(){
    // driver.get("https://www.britishairways.com/travel/home/public/en_in/");

    }
}
