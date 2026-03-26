package xpathCodes;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//flipkart
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href=\'/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19\']")).click();
		
		
		//demo qspiders
//		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin@123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		
		//github
		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@placeholder='Search or jump to...']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("query-builder-test")).sendKeys("BDM Project");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\'ActionListItem-label text-normal\']")).click();
		
		
		
		

	}

}
