package WebElementInterogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1' ]"));
		//System.out.println(logo.getCssValue("font-family"));
		System.out.println(logo.getCssValue("font"));
		System.out.println(logo.getCssValue("display"));
		driver.quit();
	}

}
