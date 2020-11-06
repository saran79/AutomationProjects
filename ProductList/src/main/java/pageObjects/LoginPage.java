package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "EmailOrAccountNumber")
    WebElement userTxtFld;
    @FindBy(name = "Password")
    WebElement passwordTxtFld;
    @FindBy(name = "SignInNow")
    WebElement loginBtn;
    @FindBy(xpath="//*[@id=\"pri\"]/div/div/div/div/div")
    WebElement errorMessage;

    public void enterUserName(String usrNameVal) {
        userTxtFld.sendKeys(usrNameVal);
    }

    public void enterUserPassword(String passVal) {
        passwordTxtFld.sendKeys(passVal);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
    public void findErrMsg(String errMsg)
    {
        String actualMsg = errorMessage.getText();
        Assert.assertEquals(errMsg,actualMsg);
        //return errorMessage.getText();
    }
}
