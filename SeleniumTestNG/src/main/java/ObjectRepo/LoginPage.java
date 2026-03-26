package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	    WebDriver driver;

	    // Constructor
	    public LoginPage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    // Locators
	    @FindBy(id="user-name")
	    WebElement userName;

	    @FindBy(id="password")
	    WebElement password;

	    @FindBy(id="login-button")
	    WebElement loginBtn;
	    // Business logic to login
	    public void enterUserName(String un){
	        userName.sendKeys(un);
	    }
	    public void enterPassword(String pwd){
	        password.sendKeys(pwd);
	    }

	    public void clickLogin(){
	        loginBtn.click();
	    }

	    public void loginToApp(String un,String pwd) {
	        userName.sendKeys(un);
	        password.sendKeys(pwd);
	        loginBtn.click();
	    }
	

}
