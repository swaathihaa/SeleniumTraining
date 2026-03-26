package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//locating the skills dropdown
		WebElement drop = driver.findElement(By.id("Skills"));
		//instantiation of select class
		Select sel=new Select(drop);
		
		//calling select method
		//By index
		sel.selectByIndex(20);
		Thread.sleep(2000);
		
		//by value attribute
		sel.selectByValue("iOS");
		Thread.sleep(2000);
		
		//by visible text
		sel.selectByVisibleText("Mac");
		Thread.sleep(2000);
		
		//by contatainsvisibleText
		sel.selectByContainsVisibleText("script");
		Thread.sleep(2000);
		driver.quit();
	}
}
