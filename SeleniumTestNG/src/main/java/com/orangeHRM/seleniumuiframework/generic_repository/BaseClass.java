package com.orangeHRM.seleniumuiframework.generic_repository;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.orangeHRM.seleniumuiframework.object_repository.demoLoginPage;

public class BaseClass {
	
    public WebDriver driver;
    	
   // demoLoginPage lp=new demoLoginPage(driver);
    
		@BeforeSuite
		public void beforeSuite() {
			Reporter.log("Executing BeforeSuite",true);
		}
		
		@BeforeTest
		public void beforeTest() {
			Reporter.log("Executing BeforeTest",true);
		}
		
		@BeforeClass
		public void beforeClass() {
			Reporter.log("Executing BeforeClass",true);
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }
		
		@BeforeMethod
		public void beforeMethod() throws IOException {
			Reporter.log("Executing BeforeMethod",true);
			
			FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");
			Properties prop=new Properties();
			prop.load(fis);
			
			String URL=prop.getProperty("url");
			//String Browser=prop.getProperty("browser");
			String ValidUsername=prop.getProperty("username");
			String ValidPassword=prop.getProperty("password");
			
			driver.get(URL);
			demoLoginPage lp=new demoLoginPage(driver);		
			lp.login(ValidUsername, ValidPassword);
		}
		
		@AfterMethod
		public void afterMethod() {
			Reporter.log("Executing afterMethod",true);
			
		}
		
		@AfterClass
		public void afterClass() {
			Reporter.log("Executing afterClass",true);
			driver.quit();
		}
		
		@AfterTest
		public void afterTest() {
			Reporter.log("Executing afterTest",true);
		}
		
		@AfterSuite
		public void afterSuite() {
			Reporter.log("Executing afterSuite",true);
	}

}



