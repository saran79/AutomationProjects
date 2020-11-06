package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeBrowser() {
        wait(10000);
        driver.quit();
    }

    public void wait(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }
   /* public String readPropertyFiles(String key) throws  Exception {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\saran\\IdeaProjects\\ProductList\\src\\main\\resources\\testData\\config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    } */
}


