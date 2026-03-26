package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vacancyPage {
	WebDriver driver;
	public vacancyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;
	
	public WebElement getAddBtn() {
		return addBtn;
	}

	public void setAddBtn() {
		getAddBtn().click();
	}
}
