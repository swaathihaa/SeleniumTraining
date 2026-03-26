package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigateto google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//navigate to youtube
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		//navigate to gfg
		driver.navigate().to("https://www.geeksforgeeks.org/profile/swaathi25");
		Thread.sleep(2000);
		driver.quit();
	}

}
