package pageObjects;

import functionsLibrary.CommonFunctions;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class LoginPage {
   public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    private String userName;
    private String passWord;
    CommonFunctions commonFunctions = new CommonFunctions();
   @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/input[1]")
    WebElement loginClick;
    public void enterUsernameAndPassword() throws Exception {

        // DataTable loginTable

         /*List<List<String >> data;
        data = Collections.singletonList(loginTable.asList());
         userName = data.get(0).get(0);
         passWord = data.get(0).get(1);
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password); */

        // Using Database to get login details

        Statement statement = commonFunctions.dataConnection().createStatement();
        ResultSet rs = statement.executeQuery("select * from login");
        while (rs.next()){
            userName = rs.getString(1);
            passWord = rs.getString(2);
        }
        commonFunctions.dataConnection().close();

        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
    }

    public void setLoginClick() {
        loginClick.click();
    }
}


