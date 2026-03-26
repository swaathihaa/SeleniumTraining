package generic_utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	//capture the webpage
		public String captureScreenShot(WebDriver driver, String testName) {
			// creating a Method for time-stamp
			String timestamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
			String path = "./Reports/" +testName+""+ timestamp + ".png";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			try {
				File perm = new File(path);
				FileHandler.copy(temp, perm);
				
			} catch (IOException e) {

				e.printStackTrace();
			}
			return path;
		}
		
		//capture the webelement
		public String captureScreenShot(WebElement element, String elementName) {
			// creating a Method for time-stamp
			String timestamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
			String path = "./Reports/"+elementName+"" + timestamp + ".png";
			File temp = element.getScreenshotAs(OutputType.FILE);

			try {
				File perm = new File(path);
				FileHandler.copy(temp, perm);
			} catch (IOException e) {

				e.printStackTrace();
			}
			return path;
		}
}