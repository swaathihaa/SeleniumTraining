package promptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class promptt {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert prompt=driver.switchTo().alert();
		System.out.println(prompt.getText());
		prompt.sendKeys("User");
		Thread.sleep(1000);
		prompt.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}