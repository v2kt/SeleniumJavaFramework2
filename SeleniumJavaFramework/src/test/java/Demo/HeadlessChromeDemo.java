package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		
		test();
	}
	
	public static void test() {
	
		
	System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\SeleniumJavaFramework\\Drivers\\chromedriver\\chromedriver.exe");	

	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("window-size=1280,800");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https:google.com");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("Game of Scrums");
	driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN); 
	
	driver.close();
	driver.quit();
	System.out.println("Completed");
	
	
		
		
	}

}
