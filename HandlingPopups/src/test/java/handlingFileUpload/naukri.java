package handlingFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.cssSelector("[data-val='exp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Swaathihaa.T.T\\OneDrive\\Desktop\\Placements\\lti form final.pdf");
	}
}