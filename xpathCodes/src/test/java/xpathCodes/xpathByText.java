package xpathCodes;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[.='X Path']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		
		//demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		List<WebElement> options=driver.findElements(By.name("pollanswers-1"));
		for(WebElement e:options) {
			e.click();
			Thread.sleep(1000);
		}

		
		

	}

}
