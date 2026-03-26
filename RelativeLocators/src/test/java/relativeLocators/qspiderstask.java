package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class qspiderstask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("test");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		password.sendKeys("password");
		
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));
		btn.click();
		
	}

}
