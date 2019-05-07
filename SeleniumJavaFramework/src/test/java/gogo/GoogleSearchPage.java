package gogo;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.googleSearchPage;

public class GoogleSearchPage {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
         googleSearch();
        
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//goto google
		driver.get("http://www.google.com");
		
		//Enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 
		googleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		 
		//click on serach box
		//driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);
		
		googleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		//quit browser
		driver.quit();
		
		System.out.println("googleSearch test succefully run.....:)");
		
	}

}
