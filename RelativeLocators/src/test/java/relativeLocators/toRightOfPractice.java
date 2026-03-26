package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class toRightOfPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ref= driver.findElement(By.id("small-searchterms"));
		ref.sendKeys("Computers");
		Thread.sleep(2000);
		driver.findElement(
			    RelativeLocator.with(By.cssSelector("input[type='submit']"))
			    .toRightOf(ref)
			).click();
		
		

	}

}
