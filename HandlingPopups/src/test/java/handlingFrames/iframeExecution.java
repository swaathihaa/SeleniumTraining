package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeExecution {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		//by index
		//driver.switchTo().frame(0);
		//by id
		driver.switchTo().frame("SingleFrame");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Helllo");
	}
}