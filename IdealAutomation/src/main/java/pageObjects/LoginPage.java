package pageObjects;

import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name="identity")
    WebElement userNameFld;

    @FindBy(name="password")
    WebElement passNameFld;

    @FindBy(name="remember")
    WebElement userChckBox;

    @FindBy(name="submit")
    WebElement loginBtn;

    public void setUserNameAndPassword(DataTable table) {

        List<List<String>>  data = table.raw();

        String usrName = data.get(0).get(0);
        String usrPass = data.get(0).get(1);

        userNameFld.sendKeys(usrName);
        passNameFld.sendKeys(usrPass);

    }

    public void setLoginBtn() {
        userChckBox.click();
         loginBtn.click();

    }
}
