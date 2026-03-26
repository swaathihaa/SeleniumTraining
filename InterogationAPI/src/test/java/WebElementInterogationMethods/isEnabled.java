package WebElementInterogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(10000);
		WebElement us=driver.findElement(By.id("check"));
		System.out.println("Is check button enabled:" +us.isEnabled());
		driver.quit();
		
	}
}
