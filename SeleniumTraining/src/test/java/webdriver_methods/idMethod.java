package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idMethod {
	public static void main(String[] args) throws InterruptedException {
		//google
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");  //Typing selenium in the search text field
		Thread.sleep(2000);
		// Click Google Search button
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
		//Search in chatgpt
		driver.get("https://chatgpt.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("prompt-textarea")).sendKeys("Selenium definition",Keys.ENTER);
		Thread.sleep(1000);
		
//		//youtube
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.name("search_query")).sendKeys("SELENIUM",Keys.ENTER);
		//driver.get("https://i.ytimg.com/vi/KRaKN0F4VBk/oardefault.jpg?sqp=-oaymwEoCJUDENAFSFqQAgHyq4qpAxcIARUAAIhC2AEB4gEKCBgQAhgGOAFAAQ==&rs=AOn4CLAIK2UVrdHeJLyIwMDetsKV2Ni8yQ&usqp=CCk");
		
		//gmaps
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.id("ucc-1")).sendKeys("Panimalar Engineering College Chennai City Campus",Keys.ENTER);
		Thread.sleep(2000);
		
		//instagram
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("_R_32d9lplcldcpbn6b5ipamH1_")).sendKeys("instagram__",Keys.ENTER);
		Thread.sleep(2000);
		
		//maven
		driver.get("https://mvnrepository.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("query")).sendKeys("By object",Keys.ENTER);
		Thread.sleep(2000);
		
		//qspiders demp
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Swaathi",Keys.ENTER);
		Thread.sleep(2000);
		
		//wikipedia
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		Thread.sleep(2000);
		
		//w3schools
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search2")).sendKeys("HTML",Keys.ENTER);
		Thread.sleep(2000);
		
		//github
		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("hero_user_email")).sendKeys("swaathi",Keys.ENTER);
		Thread.sleep(2000);
		
		//linkedin
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(3000);

		driver.findElement(By.id("username")).sendKeys("your_email");

		driver.findElement(By.id("password")).sendKeys("your_password", Keys.ENTER);
		
		driver.close();
	}
}