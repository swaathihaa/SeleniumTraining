package com.orangehrm.seleniumui.framework.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PimTest {
	
	@Test
	public void logIn() throws InterruptedException {
		//launching browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//clicking 
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Mahendra");
		driver.findElement(By.name("middleName")).sendKeys("Singh");
		driver.findElement(By.name("lastName")).sendKeys("Dhoni");
		WebElement wb=driver.findElement(By.xpath("//label[.='Employee Id']/../..//input"));
		wb.clear();
		wb.sendKeys("1025");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-switch-input")).click();		
		driver.findElement(By.xpath("//label[.='Username']/../..//input")).sendKeys("msd07");
		driver.findElement(By.xpath("//label[.='Password']/../..//input")).sendKeys("Dhoni@2026");
		driver.findElement(By.xpath("//label[.='Confirm Password']/../..//input")).sendKeys("Dhoni@2026");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		
		driver.findElement(By.xpath("//label[.='Username']/../..//input")).sendKeys("msd07");
		
		driver.findElement(By.xpath("//label[.='User Role']/../../div[.='-- Select --']")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']")).click();
		
		driver.findElement(By.cssSelector("[placeholder=\'Type for hints...\']")).sendKeys("Mahe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@role='listbox']//div)[1]")).click();
		
		driver.findElement(By.xpath("//label[.='Status']/../../div[.='-- Select --']")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']")).click();
		
		//logout
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
}
}
