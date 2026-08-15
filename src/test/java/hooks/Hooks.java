package hooks;

import DriverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.Base64;

public class Hooks {
    public static String failureScreenshot;
    @Before
    public void setup(){
       DriverFactory.initDriver();
       DriverFactory.getDriver().manage().window().maximize();
    }
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){

        byte[] screenshot = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
        failureScreenshot = Base64.getEncoder().encodeToString(screenshot);
        scenario.attach(screenshot,"image/png","Failure Screenshot");
    }
        DriverFactory.getDriver().quit();
    }
}
