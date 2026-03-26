package tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_0503 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href='http://www.orangehrm.com']")).click();
		Thread.sleep(2000);
		String s=driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> id=driver.getWindowHandles();
		id.remove(s);
//		for(String a:id) {
//			//driver.switchTo().;
//		}
//		String url=driver.getCurrentUrl();
//		//if(url)
	}

}
