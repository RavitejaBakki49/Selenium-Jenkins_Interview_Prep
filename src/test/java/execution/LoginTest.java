package execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {




    @Test
    public void validLogin() {
        System.out.println("Valid login test");
    }

    @Test
    public void invalidLogin() {
        System.out.println("Invalid login test");
    }


    @Test
    public void validLogins() {

        String actual = "Home Pages";
        String expected = "Home Page";

        Assert.assertEquals(actual, expected);
    }



    @Test(groups = "smoke")
    public void login() {
    }

    @Test(groups = "smoke")
    public void logout() {
    }
    @Test(groups = "smoke")
    public void logouts() {
    }

    @Test(groups = "regression")
    public void payment() {
    }
}
