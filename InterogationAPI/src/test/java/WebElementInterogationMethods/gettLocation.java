package WebElementInterogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//locating the search text field
		WebElement ele=driver.findElement(By.name("q"));
		Point loc=ele.getLocation();
		//position
		System.out.println(loc);
		//offset
		System.out.println(loc.getX());
		System.out.println(loc.y);
		driver.quit();
	}

}
