package pageObjects;

import functionsLibrary.CommonFunctions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DatePicker {

    WebDriver driver;

    CommonFunctions commonFunctions = new CommonFunctions();

    public DatePicker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    // xpath for date picker
    // //span[contains(text(),'October')]

    //xpath for 15th october
    // //body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/a[1]


    // @FindBy(xpath = "//a[@class='ui-state-default'][text()='29']")
    // WebElement departDate;


    @FindBy(name = "ctl00$mainContent$btn_FindFlights")
    WebElement findFlights;


    public void setDepartDate(String departDay) {
        // JavascriptExecutor executor = (JavascriptExecutor)driver;
        //  executor.executeScript("arguments[0].click();", departDate);
        //  String getDay = departDate.getText();
        //  System.out.println(getDay);

        String[] date = departDay.split("-");
        String day = date[0];
        String month = date[1];
        String year = date[2];
        // driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='" + day + "']")).click();

        while (true) {
            String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if (mon.equals(month)) {
                System.out.println(mon);
                break;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }
        // String test = driver.findElement(By.xpath("//a[contains(text(),'"+day+"')]")).getText();
        //System.out.println(test);
        driver.findElement(By.xpath("//a[contains(text(),'" + day + "')]")).click();
        // List<WebElement> allDates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        //commonFunctions.wait(10);
        //for(WebElement ele: allDates)
        //  System.out.println(ele.getText());
      /*  for (WebElement ele : allDates){
            String dateText = ele.getText();
            if(dateText.equals(day)){
                ele.click();
                break;
            }


        } */

    }

    public void setArrivalDate(String arriveDay) {
        // driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
        // commonFunctions.wait(5);
        // driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='" + arriveDay + "']")).click();
        String[] date = arriveDay.split("\\s",0);
        String day = date[0];
        String month = date[1];
        String year = date[2];

        while (true) {
            commonFunctions.wait(2);
            String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
            if (mon.equals(month)) {
                System.out.println(mon);
                break;
            } else {
                // JavascriptExecutor js = (JavascriptExecutor) driver;
                //js.executeScript("window.scrollBy(0,200)");
                //driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
                //         (By.xpath("//span[contains(text(),'Next')]"))).click();
                ////*[@id="ui-datepicker-div"]/div/a[2]/span
                // driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

                // JavascriptExecutor js = (JavascriptExecutor) driver;
                //  js.executeScript("window.scrollBy(200,0)");

                // Actions actions = new Actions(driver);
                // actions.moveToElement(element).click().build().perform();
                // driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
                // js.executeScript("arguments[0].click();",element);

                //WebElement element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span"));
                //String text = element.getText();
                //System.out.println(text);
                try {
                    commonFunctions.wait(2);
                    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
                } catch (StaleElementReferenceException se) {
                    commonFunctions.wait(3);
                    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();


                    //JavascriptExecutor js = (JavascriptExecutor) driver;
                    // js.executeScript("arguments[0].click();", element);
                    //Actions act=new Actions(driver);
                    // act.moveToElement(element).click().build().perform();
                    // element.click();
                }
            }
            commonFunctions.wait(5);

            WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'" + day + "')]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click();", ele);
        }
    }

    public void setFindFlights() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", findFlights);
    }
}
