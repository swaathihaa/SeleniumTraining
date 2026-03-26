package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyaxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/parent::h2/following::div[@class='add-info']/child::div[@class='buttons']/child::input")).click();
//		
		//make my trip
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|B|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|&ef_id=:G:s&msclkid=72767bf23aca1a6bc05012536aa635c0");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div")).click();
		//driver.findElement(By.xpath(null)).click();
		driver.findElement(By.xpath("[data-cy=\"suUrl-1\"]")).click();
		driver.findElement(By.xpath("//p[@data-cy='superOfferPtl1']/parent::div/parent::div/parent::div/child::div[@class='sliderFoot']/child::div/child::a")).click();
									
	}

}
