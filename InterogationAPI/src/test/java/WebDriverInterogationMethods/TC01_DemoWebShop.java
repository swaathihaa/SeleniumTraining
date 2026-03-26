package WebDriverInterogationMethods;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Parent:"+driver.getWindowHandle());
		Set<String> set=new HashSet<>();
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		String fbid="";
		set.addAll(driver.getWindowHandles());
		for(String s: set) {
			if(!s.equals(driver.getWindowHandle())) {
				fbid=driver.getWindowHandle();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		String twid="";
		set.addAll(driver.getWindowHandles());
		for(String s: set) {
			if(!s.equals(driver.getWindowHandle())) {
				twid=driver.getWindowHandle();
				break;
			}
		}
		
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("Facebook : "+fbid);
		System.out.println("Twittwe : "+twid);
		
		
		driver.quit();
	}

}
