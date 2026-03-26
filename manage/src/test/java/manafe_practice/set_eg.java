package manafe_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_eg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getPosition());
		
		driver.manage().window().maximize();

	}

}
