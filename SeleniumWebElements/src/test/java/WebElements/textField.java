package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		first.sendKeys("Swaathi");
		WebElement second=driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		second.sendKeys("Maran");
		Thread.sleep(2000);
		first.clear();
		
		

	}

}
