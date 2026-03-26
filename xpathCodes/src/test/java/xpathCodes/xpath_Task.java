package xpathCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//Xpath by Attribute
		
		//Google-Search
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Panimalar Engineering College Chennai City Campus",Keys.ENTER);
		Thread.sleep(2000);
		
		//OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		//wikipedia
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("AI",Keys.ENTER);
		
		//github
		driver.get("https://github.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@placeholder='Search or jump to...']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("BDM Project", Keys.ENTER);
		
		//demo qspiders
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		
		//Xpath Text
		
		//google
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//wikipedia
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[text()='English']")).click();
		
		// OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		// GitHub
		driver.get("https://github.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		// QSpiders Demo
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Xpath contains
		//Google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]"))
		      .sendKeys("Selenium", Keys.ENTER);
		Thread.sleep(2000);
		
		//OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//GitHub
		driver.get("https://github.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		
		//Wikipedia
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@class,'pure-button')]")).click();
		
		//QSpiders
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"))
		      .sendKeys("Admin");
		
		
	}

}
