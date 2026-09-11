package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("First Taking rows out");
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='contactList']//tr"));



      String beforeXpath =  "//table[@id='contactList']//tr[";
      String afterXpath = "]//td[2]";
      String reqXpath = "]//td[3]";
      String chkXpath = "]//td[1]//input";

        for(int i=2;i<rows.size();i++) {

       String contact = driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
       if(contact.equals("Maria Anders")){
           WebElement chec= driver.findElement(By.xpath(beforeXpath+i+chkXpath));
           Thread.sleep(3000);

           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click()",chec);
           Thread.sleep(1000);
          //.click();
           System.out.println(driver.findElement(By.xpath(beforeXpath+i+reqXpath)).getText());
           Thread.sleep(2000);
       }

        }
        driver.quit();

    }

}
