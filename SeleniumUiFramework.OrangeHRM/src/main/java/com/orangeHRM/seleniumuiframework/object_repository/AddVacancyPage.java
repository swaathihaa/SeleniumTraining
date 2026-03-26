
package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	
	
	WebDriver driver;
	
	public AddVacancyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//label[.='Vacancy Name']/../..//input")
	private WebElement vacancyNameTf;
	
	@FindBy(xpath="//label[.='Job Title']/../..//i")
	private WebElement jobTitle;
	
	@FindBy(css="[placeholder='Type description here']")
	private WebElement descriptionTf;
	
	@FindBy(xpath="//label[.='Hiring Manager']/../..//input")
	private WebElement hiringManagerTf;
	
	@FindBy(xpath="//label[.='Number of Positions']/../..//input")
	private WebElement noOfPositionsTf;
	
	@FindBy(css="[type='Submit']")
	private WebElement saveBtn;

	

	

	public WebElement getVacancyNameTf() {
		return vacancyNameTf;
	}

	public void setVacancyNameTf(String vacancyNameTf) {
		getVacancyNameTf().sendKeys(vacancyNameTf);;
	}

	public WebElement getJobTitle() {
		return jobTitle;
	}

	public void setJobTitleDropdown(String jobTitle) {
		getJobTitle().sendKeys(jobTitle);
	}

	public WebElement getDescriptionTf() {
		return descriptionTf;
	}

	public void setDescriptionTf(String descriptionTf) {
		getDescriptionTf().sendKeys(descriptionTf);
	}

	public WebElement getHiringManagerTf() {
		return hiringManagerTf;
	}

	public void setHiringManagerTf(String hiringManagerTf) {
		getHiringManagerTf().sendKeys(hiringManagerTf);
	}

	public WebElement getNoOfPositionsTf() {
		return noOfPositionsTf;
	}

	public void setNoOfPositionsTf(String noOfPositionsTf) {
		getNoOfPositionsTf().sendKeys(noOfPositionsTf);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn() {
		getSaveBtn().click();
	}
	
	

}
