package PopupsPractice;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		Thread.sleep(2000);
		
		String parentID=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(parentID);
		for(String childId:allWindowId) {
			driver.switchTo().window(childId);
		}
		
		WebElement btn=driver.findElement(By.tagName("button"));
		btn.click();
		btn.click();
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.xpath("//*[local-name()='svg']"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement shoppingCartList=driver.findElement(By.tagName("h2"));
		if(shoppingCartList.isDisplayed()) {
			System.out.println("Testcase status :Pass");
		}
		
		else System.out.println("Testcase status :fail");
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
