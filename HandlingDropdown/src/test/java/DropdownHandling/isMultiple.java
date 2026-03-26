package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		Select old_style=new Select(driver.findElement(By.id("oldSelectMenu")));
		Select std_multi=new Select(driver.findElement(By.id("cars")));
		System.out.println("old style select menu is multiselect : "+old_style.isMultiple());
		System.out.println("standard select (cars) is multiselect : "+std_multi.isMultiple());
		driver.quit();
	}
}