package WebElementInterogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.id("pollanswers-2"));
		System.out.println("is good button selected? "+radio.isSelected());
		radio.click();
		Thread.sleep(2000);
		System.out.println("is good button selected after clicking? "+radio.isSelected());
		driver.quit();
	}

}
