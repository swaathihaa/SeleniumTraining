package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recruitmentPage {
	
	WebDriver driver;
	
	public recruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Vacancies")
	private WebElement vacanciesTab;
	
	public WebElement getVacanciesTab() {
		return vacanciesTab;
	}

	public void setVacanciesTab() {
		getVacanciesTab().click();
	}
}
