package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class demoLoginPage {
	WebDriver driver;
	public demoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement loginBtn;
	
	

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn() {
		getLoginBtn().click();
	}
	
	public void login(String username, String password) {
		setUserName(username);
		setPassword(password);
		setLoginBtn();
	}
}