package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement ele=driver.findElement(By.id("Skills"));
		ele.click();
		Thread.sleep(2000);
		for(int i=0;i<20;i++) {
		ele.sendKeys(Keys.ARROW_DOWN);
		}
		ele.click();
		
		//driver.quit();
	}

}
