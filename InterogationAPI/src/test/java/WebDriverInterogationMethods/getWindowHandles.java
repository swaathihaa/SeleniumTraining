package WebDriverInterogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//fetching the window id of parent window and printing
		String parentId=driver.getWindowHandle();
		System.out.println("Window id of parent : "+parentId); 
		Thread.sleep(2000);
		//click on tab to get child window popup and printing it
		driver.findElement(By.xpath("//h2[.=\"Watches\"]/..//button")).click();
		Thread.sleep(2000);
		Set<String> allWindowsId=driver.getWindowHandles();
		System.out.println("Set"+allWindowsId);
		//removing parent id
		allWindowsId.remove(parentId);
		System.out.println(allWindowsId);
		for(String string : allWindowsId) {
			System.out.println(string);
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
