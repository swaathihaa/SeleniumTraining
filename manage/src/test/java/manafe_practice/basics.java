package manafe_practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(5000);
		
		//setting the size of the browser
		Dimension dim=new Dimension(1500,500);
		driver.manage().window().setSize(dim);
		System.out.println(driver.manage().window().getSize());
		driver.quit();
		
	}

}
