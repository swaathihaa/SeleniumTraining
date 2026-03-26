package practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class addToCartTest {//extends DemoBaseClass{
	
	WebDriver driver;
	
	@Test
	public void launchingBrowser() {
		
	}
	
	@Test(dependsOnMethods="launchingBrowser")
	public void login() {
		//login
		
		//verification
		if(driver.findElement(By.className("shopping_cart_link")).isDisplayed()) {
			Reporter.log("Login Successful",true);
		}
		else Reporter.log("Login failed",true);;
	}
	
	@Test(dependsOnMethods="login")
	public void addToCart(){
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		String s1=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();
	    String s2=driver.findElement(By.xpath("//div[.='Sauce Labs Bolt T-Shirt']")).getText();
	    
	    
		//verify
	    boolean f1=false;
	    boolean f2=false;
		driver.findElement(By.className("shopping_cart_link")).click();
		List<WebElement> product=driver.findElements(By.className("inventory_item_name"));
		for(WebElement cartprd:product){
			if(cartprd.getText().equals(s1)){
				f1=true;
			}
			if(cartprd.getText().equals(s2)){
				f2=true;
			}
		}

		if(f1&&f2) {
			Reporter.log("Added to cart",true);
		}
		else {
			Reporter.log("Not added to cart",true);
		}
		
	}
	
	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
