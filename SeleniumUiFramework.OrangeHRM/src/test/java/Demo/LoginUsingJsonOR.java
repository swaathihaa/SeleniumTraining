package Demo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingJsonOR {
	
	@Test
	public void login() throws IOException {
		String data=new String(Files.readAllBytes(Paths.get("./src/main/resources/demoObjectRepository/LoginPage.json")));
		JSONObject json=new JSONObject(data);
		JSONObject loginPage=json.getJSONObject("login");
		//extracting data
		String userTF=loginPage.getString("un");
		String pswTF=loginPage.getString("pass");
		String loginbtn=loginPage.getString("loginbutton");
		//splitting the string values to use in locator
		String[] userLoc=userTF.split(":");
		String[] passLoc=pswTF.split(":");
		String[] loginLoc=loginbtn.split(":");
		
		//TstScript
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		if(userLoc[0].equals("name")) {
			driver.findElement(By.name(userLoc[1])).sendKeys("Admin");
		}
		//password
		if(userLoc[0].equals("name")) {
			driver.findElement(By.name(passLoc[1])).sendKeys("admin123");
		}
		//css
		if(loginLoc[0].equals("cssSelector")) {
			driver.findElement(By.cssSelector(loginLoc[1])).click();
		}
		
		
	}

}
