package hiddenpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iz-optin-wp-btn1Txt")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("11")).click();
		Thread.sleep(2000);
	}
}
