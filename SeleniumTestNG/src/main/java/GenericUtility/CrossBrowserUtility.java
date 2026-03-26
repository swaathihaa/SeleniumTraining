package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserUtility {
	
	WebDriver driver;
	 @BeforeSuite
		public void beforeSuite() {
			System.out.println("---executing beforeSuite----" );
		}
		
	@BeforeTest
		public void beforeTest() {
			System.out.println("---executing beforeTest----");
		}
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		
		
	    ChromeDriverService options = null;
		WebDriver driver=new ChromeDriver(options);

	    driver.get("https://www.google.com");
		
		ChromeOptions copts=new ChromeOptions();
		copts.addArguments("--incognito");
		copts.addArguments("--headless");
		
		EdgeOptions eopts=new EdgeOptions();
		eopts.addArguments("--inprivate");
		eopts.addArguments("--headless");
		
		FirefoxOptions fopts=new FirefoxOptions();
		fopts.addArguments("--headless=new");
		
		Reporter.log("---Executing add to cart test class true----",true);
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver(copts);
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(fopts);
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(eopts);
		}
		
		else {
			Reporter.log("---Give me the proper browser---");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("-----Executing class---",true);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---executing beforeMthod---");
	}
	
	
	@Test
	public void testMethod() {
		System.out.println("---executing method---");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("---executing AfterMethod----");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("---executing  AfterClass----");
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("---executing  AfterTest----");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("---executing  AfterSuite----");
	}

}