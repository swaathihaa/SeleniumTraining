package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class launchingBrowser {
	public static void main(String[] args) {
		//Launching chrome browser
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new FirefoxDriver();
		
		String browser="firefox";
		
		//ChromeDriver driver;
		WebDriver driver=new ChromeDriver();
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}
	}
}
