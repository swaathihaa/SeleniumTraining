package WebDriverInterogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String exp="https://demo.automationtesting.in/Register.html";
		String act=driver.getCurrentUrl();
		if(act.equals(exp)) {
			System.out.println("Correct");
		}
		else System.out.println("Incorrect");

	}

}
