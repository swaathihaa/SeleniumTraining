package practice;

import org.testng.annotations.Test;

import GenericUtility.BaseeClass;

public class LoginTest extends BaseeClass {
	
    @Test
    public void logIn() {

        //Navigating to the application
        driver.get("https://www.saucedemo.com/");

        LoginPage lp = new LoginPage(driver);

        // Login action
        lp.enterUserName("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLogin();
    }
}