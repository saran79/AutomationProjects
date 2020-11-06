package seleniumAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationLogin {
    public void validateLoginWithValidData(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        //id for cookies accept all
        driver.findElement(By.id("u_0_k")).click();

        driver.findElement(By.id("email")).sendKeys("GameBoss@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Hello123&");
        driver.findElement(By.id("u_0_b")).click();



    }

    public static void main(String[] args) {
        AutomationLogin automationLogin = new AutomationLogin();
        automationLogin.validateLoginWithValidData();
    }
}
