package navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_To_URL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		URL url1=new URL("https://www.flipkart.com/");
		driver.navigate().to(url1);
		Thread.sleep(2000);
		
		driver.navigate().to(new URL("https://www.ubereats.com/in?srsltid=AfmBOopxiCLhpJbOFIUBNbHNZJ8_gdR3FZ2qNKX7cTk1rkcFO-GwDVm0"));
	}

}
