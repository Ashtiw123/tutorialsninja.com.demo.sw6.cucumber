package demo.com.tutorialsninja;


import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import demo.com.tutorialsninja.propertyreader.PropertyReader;
import demo.com.tutorialsninja.utility.Utilities;

import java.io.IOException;

import static demo.com.tutorialsninja.browserfactory.ManageBrowser.driver;


public class Hooks extends Utilities{

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screeShotPath = Utilities.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screeShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }


}
