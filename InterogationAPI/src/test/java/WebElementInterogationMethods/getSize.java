package WebElementInterogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//locate a webelement
		WebElement ele=driver.findElement(By.id("nav-search-submit-button"));
		System.out.println(ele.getSize());
		Dimension d=ele.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.height);
		System.out.println(d.getWidth());
		
		Thread.sleep(2000);
		driver.quit();
	}
}