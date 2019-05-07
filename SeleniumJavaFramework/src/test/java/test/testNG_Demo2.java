package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Demo2 {
	
	WebDriver driver = null;
    
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		
        System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		
	    driver = new ChromeDriver();	
		
	}
	@Test
	public void GoogleSearch2() {
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Air strike");
		
		driver.findElement(By.id("gsr")).sendKeys(Keys.ENTER);
        	
	}
	@AfterTest
	public void tearDownTest() {
		
        driver.close();
		
		System.out.println("Google test Successfully Run");
		
		
	}

}
