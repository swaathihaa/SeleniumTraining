package WebDriverInterogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
	}
}
