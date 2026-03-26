package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class rel_loc_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.cssSelector("[placeholder=\'First Name\']"));
		first.sendKeys("Test");
		Thread.sleep(2000);
		WebElement last=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(first));
		last.sendKeys("lastt");
		driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(first)).sendKeys("Chennai");
		

	}

}
