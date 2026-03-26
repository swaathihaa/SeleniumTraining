package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_HRM_EMP_002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
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
		driver.findElement(By.xpath("//span[.=\"Filter Employees\"]")).click();
		driver.findElement(By.xpath("//span[.='Select Department' and @class='ant-select-selection-placeholder']")).click();
		
		
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
		if(driver.findElement(By.id("username")).isDisplayed()) {
			System.out.println("Logged out");
		}
		else System.out.println("Not logged out");
		
		driver.quit();

	}

}
