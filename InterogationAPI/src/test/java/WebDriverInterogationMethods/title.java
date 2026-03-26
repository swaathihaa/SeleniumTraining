package WebDriverInterogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String act=driver.getTitle();
		String exp="Register";
		if(act.equals(exp)) {
			System.out.println("Correct");
		}
		else System.out.println("Incorrect");
	}

}
