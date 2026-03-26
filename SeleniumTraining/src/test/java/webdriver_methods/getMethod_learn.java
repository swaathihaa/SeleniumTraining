package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod_learn {

	public static void main(String[] args) throws InterruptedException {
		//Launching Browser
		WebDriver driver=new ChromeDriver();
		
		//Navigating to youtube
		driver.get("https://www.amazon.in");
		
		//wait
		Thread.sleep(2000);
		
		//fetching the title of the webpage
		System.out.println(driver.getTitle());
		
		//fetching the url of current web page
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//fetching the source code of page
		System.out.println(driver.getPageSource());
		
		//closing the driver controlled window
		driver.close();
		
	}
}