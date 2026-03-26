package tasks;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM_system {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//OrangeHRM-System Testing
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("admin22");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type here']"))
	      .sendKeys("abcddd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
