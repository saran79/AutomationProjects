package fbAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

     @Test
    public void enterUserDetails(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("sss@yahoo.com");
        driver.findElement(By.name("pass")).sendKeys("sss@yahoo.com");
        driver.findElement(By.name("")).sendKeys("");
        driver.findElement(By.id("loginbutton")).click();


    }

    public static void main(String[] args) {
       LoginPage loginPage = new LoginPage();
        loginPage.enterUserDetails();
   }
}
