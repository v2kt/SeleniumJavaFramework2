package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.searchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null; 

	public static void main(String[] args) {
		

	}
	public static void googleSearchTest(){
		

		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		searchPageObject searchPageObj1 = new searchPageObject(driver);
		
		driver.get("https://google.com");
		
		searchPageObj1.setTextInSearchBox("A B C D");
		
		searchPageObj1.clickSearchButton(null);
		
		driver.close();
	}

}
