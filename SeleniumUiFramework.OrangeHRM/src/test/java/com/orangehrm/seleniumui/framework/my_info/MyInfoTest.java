package com.orangehrm.seleniumui.framework.my_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MyInfoTest {
	@Test
	public void logIn() {
		//launching browser
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//clicking myinfo
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		//
		driver.findElement(By.name("firstName")).sendKeys("Jeet",Keys.ENTER);
	}
}
