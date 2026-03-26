package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	
	@Test
	public void demoTest() {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String actualValue="Googleee";
	String expValue=driver.getTitle();
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actualValue, expValue);
	
	if(actualValue.equals(expValue)) {
		System.out.println("Status : Pass");
	}
	else System.out.println("Staus : Fail");
	//sa.assertAll();
	}
}
