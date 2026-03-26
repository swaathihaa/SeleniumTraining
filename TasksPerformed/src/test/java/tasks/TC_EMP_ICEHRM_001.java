package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_EMP_ICEHRM_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.id("username")).sendKeys("Abcd");
		driver.findElement(By.id("password")).sendKeys("aaaa");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and .='Log in ']")).click();
		if(driver.findElement(By.cssSelector("[class=\'alert alert-danger\']")).isDisplayed()) {
			System.out.println("invalid credential error message is displayed");
		}
		else System.out.println("invalid credential error message is not displayed");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and .='Log in ']")).click();
		if(driver.findElement(By.id("EmployeeProfileStatus")).isDisplayed()) {
			System.out.println("login successful");
		}
		else System.out.println("login failed");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.=\'Employees\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[href=\'https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees\']")).click();
		driver.findElement(By.id("tabEmployeeSkill")).click();
		driver.findElement(By.xpath("//span[.=\' Add New\']")).click();
//		WebElement name=driver.findElement(By.id("rc_select_0"));
//		name.click();
//		name.sendKeys("Lala Lamees",Keys.ENTER);
//		driver.findElement(By.id("rc_select_4")).click();
//		driver.findElement(By.xpath("//div[@class=\'ant-select-item-option-content\' and .='Information Security']")).click();
//		driver.findElement(By.id("details")).sendKeys("Very skillful",Keys.ENTER);
//		driver.findElement(By.xpath("//span[.='Save']")).click();
		
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		if(driver.findElement(By.id("EmployeeProfileStatus")).isDisplayed()) {
			System.out.println("Dialog box closed");
		}
		else System.out.println("Dialog box not closed");
		
		
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
		if(driver.findElement(By.id("username")).isDisplayed()) {
			System.out.println("Logged out");
		}
		else System.out.println("Not logged out");
		
		driver.quit();

	}

}
