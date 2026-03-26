package generic_utility;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {

    WebDriver driver;
    Actions act;

    public ActionsHelper(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);  
    }

    //-- Click
    public void click(WebElement e) {
        act.moveToElement(e).click().perform();
    }

    //-- Double Click
    public void doubleClick(WebElement e) {
        act.doubleClick(e).perform();
    }

    //-- Dropdown navigation using keyboard
    public void navigateDropDown(WebElement element, int downArrowIndex, long timeInSec) {
		act.click(element).pause(Duration.ofSeconds(timeInSec));
		for (int i = 0; i < downArrowIndex; i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
	}

    //-- Send Keys
    public void sendKeys(WebElement e, String text) {
        act.sendKeys(e, text).perform();
    }
    
    
    //scroll down auto suggestion
    public void scrollDownAutoSuggestion(WebElement element,String text,long timeInSeconds, int downArrowIndex) {
    	act.sendKeys(element,text).pause(Duration.ofSeconds(timeInSeconds)).perform();
    	for(int i=1;i<downArrowIndex;i++) {
    		act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
    	}
    	act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
    }
}