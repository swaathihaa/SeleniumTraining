package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class weeklyTC02 {
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
	}
	
	@Test(dependsOnMethods="login")
	public void sorting() {
		driver.findElement(By.cssSelector("[class=\'select_container\']")).click();
		driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='lohi']")).click();
		//used indexing to target first product after sorting
		driver.findElement(By.xpath("(//button[.='Add to cart'])[1]")).click();
	}
	
	@Test(dependsOnMethods="sorting")
	public void prdinCart() {
		driver.findElement(By.id("shopping_cart_container")).click();
		String exp="Sauce Labs Onesie";
		String act=driver.findElement(By.xpath("//div[@class=\'inventory_item_name\']")).getText();
		Assert.assertEquals(act, exp);
		System.out.println("Cart Validated");
		//proceed to checkout
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Abcd");
		driver.findElement(By.id("last-name")).sendKeys("Efgh");
		driver.findElement(By.id("postal-code")).sendKeys("600100");
		driver.findElement(By.id("continue")).click();
	}
	
	@Test(dependsOnMethods="prdinCart")
	public void verifySummary() {
		//verify prd summary in checkout page
		String exp="Sauce Labs Onesie";
		String act=driver.findElement(By.xpath("//div[@class=\'inventory_item_name\']")).getText();
		Assert.assertEquals(act, exp);
		System.out.println("Summary Verified");
		//complete order
		driver.findElement(By.id("finish")).click();
	}
	
	
	@Test(dependsOnMethods="verifySummary")
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.close();
	}
}
