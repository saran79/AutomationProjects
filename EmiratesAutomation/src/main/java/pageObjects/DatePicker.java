package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DatePicker {


    WebDriver driver;
    CommonFunctions commonFunctions = new CommonFunctions();

    public DatePicker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setOutboundDate(String outDate) {

        String[] daySplitter = outDate.split("-");
        String day = daySplitter[0];
        String mon = daySplitter[1];
        String year = daySplitter[2];

        System.out.println(mon);

        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div[2]/div/div/div[2]/section/div[4]/div[1]" +
                "/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr/td/a")).click();

    }
// depart
    ///html/body/main/div[2]/div/div/div[1]/div[2]/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr/td/a
//arrive
////*[@id="panel0"]/div[2]/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr/td/a

}
