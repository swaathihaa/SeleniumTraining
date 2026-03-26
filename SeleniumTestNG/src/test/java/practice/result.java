package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class result {
	@Test
	public void check() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://coe1.annauniv.edu/");
	
}
}
