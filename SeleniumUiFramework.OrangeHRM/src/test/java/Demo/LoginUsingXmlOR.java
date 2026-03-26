package Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	@Test
	public void test() throws SAXException, IOException, ParserConfigurationException {
		Document file=DocumentBuilderFactory.newInstance().newDocumentBuilder()
		.parse(new File("./src/main/resources/demoObjectRepository/loginPage.xml"));
		
		//fetching string value
		String username = file.getElementsByTagName("username")
                .item(0)
                .getTextContent();

		String pass = file.getElementsByTagName("password")
                .item(0)
                .getTextContent();

		String loginbtn = file.getElementsByTagName("loginbtn")
                 .item(0)
                 .getTextContent();
		
		//splitting the locator and values
		String userLoc=username.split(":")[0];
		String userVal=username.split(":")[1];
		
		String passLoc=pass.split(":")[0];
		String passVal=pass.split(":")[1];
		
		String loginLoc=loginbtn.split(":")[0];
		String loginVal=loginbtn.split(":")[1];
		
		//test script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		if(userLoc.equals("name")) {
			driver.findElement(By.name(userVal)).sendKeys("Admin");
		}
		//password
		if(passLoc.equals("name")) {
			driver.findElement(By.name(passVal)).sendKeys("admin123");
		}
		//login
		if(loginLoc.equals("css")) {
			driver.findElement(By.cssSelector(loginVal)).click();
		}
	}
}
