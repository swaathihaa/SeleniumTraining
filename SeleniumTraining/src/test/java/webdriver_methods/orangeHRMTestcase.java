package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMTestcase {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("SELENIUM",Keys.ENTER);
//		driver.get("https://i.ytimg.com/vi/KRaKN0F4VBk/oardefault.jpg?sqp=-oaymwEoCJUDENAFSFqQAgHyq4qpAxcIARUAAIhC2AEB4gEKCBgQAhgGOAFAAQ==&rs=AOn4CLAIK2UVrdHeJLyIwMDetsKV2Ni8yQ&usqp=CCk");
	}
}
