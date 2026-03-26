package webdriver_methods;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		
		for(WebElement link : allLinks) {
		if(link.getText().equals("About")) {
			link.click();
			break;
		}}

		//testcase
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.className("form-control ng-dirty ng-valid-parse ng-touched ng-invalid ng-invalid-required")).click();

	}

}
