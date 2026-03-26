package com.orangehrm.seleniumui.framework.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PimTest06 {
	@Test
	public void logIn() throws InterruptedException {
		//launching browser
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//clicking 
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		
		driver.findElement(By.xpath("//span[text()='Configuration ']")).click();
		driver.findElement(By.xpath("//a[text()='Termination Reasons']")).click();
		driver.findElement(By.cssSelector("[class=\'oxd-button oxd-button--medium oxd-button--secondary\']")).click();
		
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Personal Reasons");
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
		
		String reason=driver.findElement(By.xpath("//div[text()='Personal Reasons']")).getText();

		if(reason.equals("Personal Reasons")) {
		    System.out.println("Termination reason verified");
		}
		else System.out.println("Termination reason is not verified");
		
		//logout
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}