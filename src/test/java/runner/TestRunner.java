package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import listeners.TestListener;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
@CucumberOptions(features="src/test/resources/features/",glue = {"stepDefs","hooks"},
        plugin ={"pretty","html:target/cucumber-html.html"} )


public class TestRunner extends AbstractTestNGCucumberTests {
}
