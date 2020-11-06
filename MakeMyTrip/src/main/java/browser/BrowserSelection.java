package browser;
 import io.github.bonigarcia.wdm.WebDriverManager;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

    public class BrowserSelection
    {
        static WebDriver driver;

        public static WebDriver usingChrome()
        {
            //System.setProperty("webdriver.chrome.driver", "E:\\SeleniumLibs\\\\chromedriver_win32\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
    }

