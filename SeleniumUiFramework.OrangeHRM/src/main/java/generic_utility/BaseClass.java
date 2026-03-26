package generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;

import com.orangeHRM.seleniumuiframework.object_repository.dashboardPage;
import com.orangeHRM.seleniumuiframework.object_repository.demoLoginPage;

public class BaseClass {

    public WebDriver driver;

    fileUtility fiu = new fileUtility();
    public WebDriverUtility wdu;

    demoLoginPage lp;
    public dashboardPage dsp;

    @BeforeSuite
    public void beforeSuite() {
        Reporter.log("Executing beforeSuite",true);
    }

    @BeforeTest
    public void beforeTest() {
        Reporter.log("Executing beforeTest",true);
    }

    @BeforeClass(groups = {"Regression", "Smoke"})
    public void beforeClass() throws IOException {

        Reporter.log("Executing beforeClass",true);

        String browser = fiu.getPropertyKeyvalue("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        } else {
            driver=new EdgeDriver();
        }

        wdu=new WebDriverUtility(driver);

        wdu.configMaximizeBrowser();
        wdu.implicitWait(30);

        lp=new demoLoginPage(driver);
        dsp=new dashboardPage(driver);
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {

        Reporter.log("Executing beforeMethod", true);

        String url=fiu.getPropertyKeyvalue("url");
        String username=fiu.getPropertyKeyvalue("username");
        String password=fiu.getPropertyKeyvalue("password");

        wdu.navigateToApplication(url);
        lp.login(username, password);
    }

    @AfterMethod
    public void afterMethod() {

        Reporter.log("Executing afterMethod", true);

        if (dsp!= null) {
            dsp.logoutFromApp();
        }
    }

    @AfterClass
    public void afterClass() {

        Reporter.log("Executing afterClass", true);
        driver.quit();
    }

    @AfterTest
    public void afterTest() {
        Reporter.log("Executing afterTest", true);
    }

    @AfterSuite
    public void afterSuite() {
        Reporter.log("Executing afterSuite", true);
    }
}