package functionsLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {


    public static WebDriver driver;

    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public Connection dataConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testproductdb", "root",
                "");
        return connection;

    }

    public void closeBrowser() {
        wait(10);
        driver.quit();
    }

    public void wait(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }
   /* public String readPropertyFiles(String key) throws  Exception {
        FileInputStream inputStream = new FileInputStream(FilePaths.configFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    } */
}
