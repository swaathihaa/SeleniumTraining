package DropdownHandling;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
		Select sel=new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("Mens Cotton Jacket...");
		sel.selectByVisibleText("John Hardy Women's L...");
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		sel.selectByVisibleText("SanDisk SSD PLUS 1TB...");
		
		//deselct by index
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		//deselect by vlaue
		sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
		Thread.sleep(2000);
		//deselect by visibletext
		sel.deselectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		//deselct by contains visible text
		sel.deSelectByContainsVisibleText("SSD");
		Thread.sleep(2000);
		
		//selecting once again
		sel.selectByVisibleText("Mens Cotton Jacket...");
		sel.selectByVisibleText("John Hardy Women's L...");
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		
		//deselect all
		sel.deselectAll();
		Thread.sleep(2000);
		
		
		//selecting once again
		sel.selectByVisibleText("Mens Cotton Jacket...");
		sel.selectByVisibleText("John Hardy Women's L...");
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		
		//fetching the options from dropdown
		List<WebElement> opts=sel.getOptions();
		for(WebElement o:opts) {
			System.out.println(o.getText());
		}
		
		driver.quit();
	}

}
