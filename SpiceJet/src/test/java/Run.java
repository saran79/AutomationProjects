import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {}, dryRun =false, strict = true)
public class Run {
}
//Scenario: select the origin and destination