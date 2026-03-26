package com.orangehrm.seleniumui.framework.recuitment;


import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangeHRM.seleniumuiframework.generic_repository.BaseClass;
import com.orangeHRM.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangeHRM.seleniumuiframework.object_repository.dashboardPage;
//import com.orangeHRM.seleniumuiframework.object_repository.demoLoginPage;
import com.orangeHRM.seleniumuiframework.object_repository.recruitmentPage;
import com.orangeHRM.seleniumuiframework.object_repository.vacancyPage;

import generic_utility.ActionsHelper;
import generic_utility.ExcelUtility;

public class CreateVacancyTest extends generic_utility.BaseClass{
	//WebDriver driver;
	
	@Test
	public void addVacancy() throws EncryptedDocumentException, IOException {
		
		ExcelUtility eu=new ExcelUtility();
		recruitmentPage rp=new recruitmentPage(driver);
		vacancyPage vp=new vacancyPage(driver);
		AddVacancyPage addvp=new AddVacancyPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		SoftAssert sa=new SoftAssert();
		
		dsp.setRecruitmentTab();
		rp.setVacanciesTab();
		vp.setAddBtn();
	//	addvp.setVacancyNameTextField("tertghnm");
		eu.loadExcelFile("./src/test/resources/OrangeHRM_Recruitment_Vacancy_TestData/vacancies.xlsx", "AddVacancy");
		addvp.setVacancyNameTf(eu.getData(1, 1));
		ah.navigateDropDown(addvp.getJobTitle(), 2,4 );
	//	addvp.setDescriptionTextField("vacant job");
		addvp.setDescriptionTf(eu.getData(1, 2));
		ah.scrollDownAutoSuggestion(addvp.getHiringManagerTf(), "Ra", 4, 2);
		//addvp.setNoOfPositionsTextField("10");
		addvp.setNoOfPositionsTf(eu.getData(1, 3));
		addvp.setSaveBtn();
		
		List<WebElement> validationVacancyName=driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']"));
		for(WebElement vacancyName:validationVacancyName) {
			String name=vacancyName.getText();
			sa.assertEquals(name, eu.getData(1, 3));
			if(name==eu.getData(1, 3)) {
				System.out.println("true");
				Reporter.log("TestCase status : pass",true);
			}
			else {
				System.out.println("false");
				Reporter.log("TestCase status : fail",true);
			}
			
		}
		
		
		
//		Actions act=new Actions(driver);
//		dashboardPage dash=new dashboardPage(driver);
//		AddVacancyPage advp=new AddVacancyPage(driver);
//		//demoLoginPage dlp=new demoLoginPage(driver);
//		recruitmentPage rp=new recruitmentPage(driver);
//		vacancyPage vp=new vacancyPage(driver);
//		
//		dash.getRecruitmentTab();
//		rp.getVacanciesTab();
//		vp.setAddBtn();
//		advp.setVacancyNameTf("TE");
//		act.click(advp.getJobTitle()).pause(2000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		advp.setDescriptionTf("Need highly talented executive");
//		act.sendKeys(advp.getHiringManagerTf(),"Rahul").pause(4000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//		advp.setNoOfPositionsTf("10");
//		advp.setSaveBtn();
	}
}
