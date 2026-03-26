package generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	 WebDriver driver;
	 WebDriverWait wait;
	 public WebDriverUtility(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	//manage
	 
	//--maximize
	public void configMaximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	//--minimize
	public void configMinimizeBrowser() {
		driver.manage().window().minimize();
	}
	
	//--fullscreen
	public void configFullScreenBrowser() {
		driver.manage().window().fullscreen();
	}
	
	//--browsersize
	public Dimension fetchBrowserSize() {
		Dimension dim=driver.manage().window().getSize();
		return dim;
	}
	
	public void setBrowserSize(int width,int height) {
		driver.manage().window().setSize(new Dimension(width,height));
	}
	
	//--position
	public Point fetchPosition() {
		Point p=driver.manage().window().getPosition();
		return p;
	}
	
	public void setPosition(int width,int height) {
		driver.manage().window().setPosition(new Point(width, height));
	}
	
	//navigate
	//--navigate to
	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}
	
	//--forward
	public void navigateForward() {
		driver.navigate().forward();
	}
	
	//--backward
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	//--refresh
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	
	//get
	//--geturl
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	//--get_title
	public String getTitleOfPage() {
		return driver.getTitle();
	}
	
	//--url
	public void enterURL(String url) {
		driver.get(url);
	}
	
	//quit--closing
	public void closingCurrentTab() {
		driver.close();
	}
	
	public void closingAllTab() {
		driver.quit();
	}
	
	//timeouts
	
	//--implicit wait
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	//explicit wait
	
	public void waitForElementToBeClickable(WebElement element,long seconds) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToBeVisible(WebElement element,long seconds) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	//popups
	
	//--Alerts
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public void typeMessageInJavaScript(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String fetchJavascriptPopupMessage() {
		String s=driver.switchTo().alert().getText();
		return s;
		
	}
	
	//childWindowSwitching
	public void childWindowSwitchByTitle(String childApplicationTitle) {
//		driver.switchTo().window(childHandle);
//		if(childHandle.equals(driver.getWindowHandle())) {
//			System.out.println("Child Window Switching Validated");
//		}
//		else System.out.println("Child Window not Switched");
		
		String parentID=driver.getWindowHandle();
		Set<String> childIds=driver.getWindowHandles();
		childIds.remove(parentID);
		for(String child:childIds) {
			driver.switchTo().window(child);
			String title=driver.getTitle();
			if(title.contains(childApplicationTitle)) {
				break;
			}
		}
	}
	
	public void childWindowSwitchByURL(String childApplicationURL) {
		String parentID=driver.getWindowHandle();
		Set<String> childIds=driver.getWindowHandles();
		childIds.remove(parentID);
		for(String child:childIds) {
			driver.switchTo().window(child);
			String title=driver.getCurrentUrl();
			if(title.contains(childApplicationURL)) {
				break;
			}
		}
	}
	
	//iFrame
	public void switchFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchFrameByIdorNAme(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	
	public void switchBacktheControlToPreviousFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void switchBacktheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
	

}