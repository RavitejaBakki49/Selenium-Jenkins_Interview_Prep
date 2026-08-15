package stepDefs;


import io.cucumber.java.en.*;

import pages.LoginPage;


public class LoginSteps {




    private LoginPage loginPage;



    public LoginSteps(){
        loginPage = new LoginPage();
    }

    @Given("the browser is launched")
    public void the_browser_is_launched() {

        loginPage.welcome();

    }
    @When("the testing URL opens and we enter username and password")
    public void the_testing_url_opens_and_we_enter_username_and_password() {


      loginPage.actions();



    }
    @Then("it should open the home page")
    public void it_should_open_the_home_page() throws InterruptedException {
      loginPage.verify();


    }





}
