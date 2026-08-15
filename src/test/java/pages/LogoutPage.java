package pages;

import DriverManager.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {


    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By submit = By.xpath("//button[@type='submit']");
    private By display = By.xpath("//a/i[.=' Logout']");



    public LogoutPage(){
        driver = DriverFactory.getDriver();
    }
    public void  welcome(){
        System.out.println("Hi welcome to the Logout Page");
    }

    public void actions(){


        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(username).sendKeys("tomsmith");
        driver.findElement(password).sendKeys("SuperSecretPassword!");
        driver.findElement(submit).click();
    }
    public void verify(){

        driver.findElement(display).isDisplayed();
    }

    public void ver(){

        System.out.println(driver.getTitle());


    }
}
