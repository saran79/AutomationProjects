
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {}, dryRun = false, strict = true,
        plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/TSR/tsr1.html"}
        )
public class Run {


    @AfterClass
    public static void generateReport() {
        Reporter.loadXMLConfig("C:\\Users\\saran\\IdeaProjects\\BaAutomation\\src\\main\\resources\\reportConfig\\extent-config.xml");
          }
}