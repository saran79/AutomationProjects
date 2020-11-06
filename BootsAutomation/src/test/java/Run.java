import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
                tags = "",
                dryRun = false)

//plugin = ""com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr.html"

public class Run {
    //@AfterClass
    //public static void generateReport(){

     //   Reporter.loadXMLConfig("C:\\Users\\saran\\IdeaProjects\\BootsAutomation\\src\\main\\resources\\" +
      //          "reportConfig\\extent-config.xml");
  //  }
}

//@login
 //   Scenario: Validate User Login
//          | Ross.Taylor@emailcom.com | NewZealand12 |