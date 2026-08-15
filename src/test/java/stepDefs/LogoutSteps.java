package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutSteps {

    private LogoutPage logoutPage;
    public LogoutSteps(){
        logoutPage = new LogoutPage();
    }

    @Given("the browser is launcheds")
    public void the_browser_is_launched() {

        logoutPage.welcome();

    }
    @When("the testing URL opens and we enter username and passwords")
    public void the_testing_url_opens_and_we_enter_username_and_password() {
        logoutPage.actions();


    }
    @Then("it should open the home pages")
    public void it_should_open_the_home_page() throws InterruptedException {
        logoutPage.verify();
    }
    @Then("verifyit")
    public  void verification(){
        logoutPage.ver();
    }



}
