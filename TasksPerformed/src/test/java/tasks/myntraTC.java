package tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class myntraTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		//search
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Dresses",Keys.ENTER);
		Thread.sleep(3000);
		
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.id("36519615")).click();
		//driver.findElement(By.xpath("(//h3)[1]")).click();
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(parentId);
		// switch to child window
		for (String id : allWindows) {
				driver.switchTo().window(id);
		}
		//Thread.
		driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
		Thread.sleep(3000);
		WebElement signup=driver.findElement(By.className("welcome-header-small"));
		if(signup.isDisplayed()) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase failed");
		}
		
		driver.quit();
	}
}