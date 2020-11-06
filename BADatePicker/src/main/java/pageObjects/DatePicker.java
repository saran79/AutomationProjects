package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class DatePicker {

    WebDriver driver;
    WebDriverWait webDriverWait;
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

        driver.findElement(xpath("//div[@id='flight-outbound-date-selector']")).click();
        while (true) {
         //   String month = driver.findElement(xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']/div/div[2]/div[1]/div/div[2]/span[1]/span")).getText();;

               String month = driver.findElement(xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']/div/div[2]/div[1]/div/div[2]/span[1]/span")).getText();

            if (month.equals(mon)) {
                break;
            } else {
                try {
                    //driver.findElement(xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']/div/div[2]/div[1]/div/div[2]/span[3]/span"));
                    commonFunctions.clickOn(xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']/div/div[2]/div[1]/div/div[2]/span[3]/span"),driver,4);


                } catch (StaleElementReferenceException se) {
                    driver.findElement(By.xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']/div/div[2]/div[1]/div/div[2]/span[3]/span")).click();
                   // commonFunctions.wait(2);
                }
            }
        }
            commonFunctions.wait(2);

            List<WebElement> allDates = driver.findElements(xpath("//*[@id='datepicker-pop-up-modal ba-datepicker']" +
                    "/div/div[2]/div[2]/div[3]/table/tbody/tr/td/div[1]/span"));

            for (WebElement ele : allDates) {
                // System.out.println(ele.getText());
                String strOut = ele.getText();
                System.out.println(strOut);
                if (strOut.equals(outDate)) {
                    ele.click();
                    break;
                }
            }
        }

        public void setInboundDate (String inDate){

        }

    }
