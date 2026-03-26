package handlingFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\Swaathihaa.T.T\\OneDrive\\Desktop\\Selenium+Java Calendar.xlsx");

	}

}
