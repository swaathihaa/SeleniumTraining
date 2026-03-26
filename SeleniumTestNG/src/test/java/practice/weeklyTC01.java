package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class weeklyTC01 {
	WebDriver driver=new EdgeDriver();
	@Test
	public void login() {
		//launching browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		//logging in
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		//validate product page
		String actual=driver.findElement(By.cssSelector("[class='title']")).getText();
		String exp="Products";
		Assert.assertEquals(actual,exp);
		System.out.println("Login validated");
	}
	

	
	@Test(dependsOnMethods="login")
	public void addtocart() {
		//adding products to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		
		//validation of cart products
		String s1=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();
	    String s2=driver.findElement(By.xpath("//div[.='Sauce Labs Bolt T-Shirt']")).getText();
	    
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
		Assert.assertEquals(f2,f1);
		System.out.println("Products in cart is validated");
		
	}
	
	@Test(dependsOnMethods="addtocart")
	public void checkout() {
		//checkout details
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Abcd");
		driver.findElement(By.id("last-name")).sendKeys("Efgh");
		driver.findElement(By.id("postal-code")).sendKeys("600100");
		driver.findElement(By.id("continue")).click();
		//validation
		String val="Total: $49.66";
		String total=driver.findElement(By.xpath("//div[@class=\'summary_total_label\']")).getText();
		Assert.assertEquals(total, val);
		System.out.println("validated price "+val);
		driver.findElement(By.id("finish")).click();
	}
	
	@Test(dependsOnMethods="checkout")
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.close();
	}
}
