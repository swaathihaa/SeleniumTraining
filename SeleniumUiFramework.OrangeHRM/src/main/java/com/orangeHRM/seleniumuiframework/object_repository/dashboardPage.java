package com.orangeHRM.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {
    WebDriver driver;
    
    public dashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Recruitment")
    private WebElement recruitmentTab;
    
    public WebElement getRecruitmentTab() {
        return recruitmentTab;
    }

    public void setRecruitmentTab() {
        recruitmentTab.click();
    }
    
    @FindBy(css = ".oxd-userdropdown-name")
    private WebElement logoutDropDown;

    public WebElement getLogOutDropDown() {
        return logoutDropDown;
    }

    public void setLogoutDropDown(WebElement logoutDropDown) {
        this.logoutDropDown.click();
    }

    @FindBy(linkText = "Logout")
    private WebElement logout;

    public WebElement getLogout() {
        return logout;
    }

    public void setLogout() {
        logout.click();
    }

    
    public void logoutFromApp() {
        logoutDropDown.click();   // open dropdown
        logout.click();           // then click logout
    }
}