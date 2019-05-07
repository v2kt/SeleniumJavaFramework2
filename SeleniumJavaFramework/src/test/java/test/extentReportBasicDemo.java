package test;

import java.lang.Thread.State;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportBasicDemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(htmlReporter); 

		ExtentTest test1 = extent.createTest("Google Search test1","To validate GoogleSearch Test......");

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		test1.log(Status.INFO,"starting test case");
		
		driver.get("https://www.google.com");
		
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Dance With Madhuri");
		test1.pass("Entered text in text box");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		test1.pass("Passed Keyboard Entered key");
		
		driver.close();
		test1.pass("Closed Browser");
		
		driver.quit();
		test1.pass("Quit Browser");
		
		test1.pass("Test Completed");
		
		extent.flush();
	}

}
