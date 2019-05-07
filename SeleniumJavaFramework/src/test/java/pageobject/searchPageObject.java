package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class searchPageObject {
	
	WebDriver driver = null;

		By textbox_search=By.className("gLFyf gsfi");
		
		By Button_search=By.name("btnk");
		
		public searchPageObject(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public void setTextInSearchBox(String text) {
			
			driver.findElement(textbox_search).sendKeys(Keys.RETURN);
		}
		
public void clickSearchButton(String text) {
			
			driver.findElement(Button_search).click();
		}

	}


