package WebDriverInterogationMethods;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_selenium_approach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Parent:"+driver.getWindowHandle());
		Set<String> set=new HashSet<>();
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();	
		set.addAll(driver.getWindowHandles());
		for(String s:set) {
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			System.out.println(s);
		}
		
		driver.quit();
	}
}






