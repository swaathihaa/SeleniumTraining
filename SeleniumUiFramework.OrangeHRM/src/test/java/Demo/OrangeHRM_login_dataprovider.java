package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHRM.seleniumuiframework.object_repository.demoLoginPage;

public class OrangeHRM_login_dataprovider {
	WebDriver driver;
	@DataProvider(name="LoginData")
	Object[][] getCredential(){
		return new Object[][] {
			{"Admin","admin123"}
			
		};
	}
		
		@Test(dataProvider="LoginData")
		
		public void login(String user,String pass) {
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
			driver.manage().window().maximize();
			demoLoginPage lp=new demoLoginPage(driver);
			lp.login(user,pass);
		}
	

}