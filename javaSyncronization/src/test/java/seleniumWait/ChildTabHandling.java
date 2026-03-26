package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildTabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.linkText("Open In New Tab")).click();
		Set<String> ids=driver.getWindowHandles();
		ids.remove(driver.getWindowHandle());
		for(String id:ids) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.id("email")).sendKeys("capg@gmail.com");

	}

}
