package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads') and @class]")).click();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\'vl-flyout-nav__link-container\' and @href=\'https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545\']")).click();
		
	}
}
