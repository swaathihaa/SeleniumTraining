package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage{
	WebDriver driver;
	
	public dashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Recruitment")
	private WebElement recruitmentTab;
	
	public WebElement getRecruitmentTab() {
		return recruitmentTab;
	}

	public void setRecruitmentTab() {
		getRecruitmentTab().click();
	}

}
