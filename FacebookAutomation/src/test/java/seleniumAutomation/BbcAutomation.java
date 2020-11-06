package seleniumAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcAutomation {
    public void autoOpen() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://account.bbc.com/signin?lang=en-GB&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&isCasso=false&action=sign-in&redirectUri=https%3A%2F%2Fsession.bbc.co.uk%2Fsession%2Fcallback&service=IdSignInService&nonce=zWNIS7Rh-MOnJcahpUufkvTd1L8O78mw5WtU");

        driver.findElement(By.id("user-identifier-input")).sendKeys("GameBoss@gmail.com");
        driver.findElement(By.id("password-input")).sendKeys("Hello123&");
        driver.findElement(By.name("submit-button")).click();
    }

    public static void main(String[] args) {
        BbcAutomation bbcAutomation = new BbcAutomation();
        bbcAutomation.autoOpen();
    }
}


