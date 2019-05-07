package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_GoogleSearch {

	public static void main(String[] args) {
	
	GoogleSearch();

	}
	
	public static void GoogleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		//System.out.println("projectPath:"+projectPath);
		
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com/");
		
		//enter text in search textBox
		driver.findElement(By.name("q")).sendKeys("Air strike");
		
		//click on search button
		//driver.findElement(By.name("btnk")).click();
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.id("btnk")).sendKeys(Keys.RETURN);
		
		
		//driver.findElement(By.id("gsr")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]"));



		
		//close browser
		driver.close();
		
		//driver.quit();
		
		System.out.println("Google test Successfully Run");
			
		
	}

}
