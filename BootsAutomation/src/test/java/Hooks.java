import functionsLibrary.CommonFunctions;
import io.cucumber.java.Before;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest() {
        commonFunctions.openBrowser();
    }

    // @After
    // public void afterTest() {

    //    commonFunctions.closeBrowser();

    //  }
}
