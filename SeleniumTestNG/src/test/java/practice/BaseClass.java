package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
WebDriver driver=null;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("---Executing Suite---",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("---Executing Test---",true);
	}
	@BeforeClass
	public void beforeClass() {
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Reporter.log("---Executing Class---",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Executing Method---",true);
	}
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("---Executing After Method---",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("---Executing After Class---",true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("---Executing After Test---",true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("---Executing After Suite---",true);
	}
	
}
