package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    
    WebDriver driver;
	
    @BeforeSuite
	public void setUp(){

		    htmlReporter = new ExtentHtmlReporter("extent.html");

			extent = new ExtentReports();

			extent.attachReporter(htmlReporter); 
			
			String projectPath = System.getProperty("user.dir");

			System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		@Test
		public void test(){
			
			ExtentTest test = extent.createTest("Google Search test1","To validate GoogleSearch Test......");
			
			driver.get("https://google.com");
			test.pass("Navigated to google.com");
			test = extent.createTest("logsGeneration");
	        test.log(Status.INFO,"createTest() method will return the ExtentTest object");
	        test.log(Status.INFO, "I am in actual Test");
	        test.log(Status.INFO, "We can write the actual test logic in this Test");
	         
	        // Using Labels
	        test.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.BLUE));

		}
		
		@AfterTest
	/*	public void tearDownTest(){
			

			driver.close();
			test.pass("Closed Browser");
			
			driver.quit();
			test.pass("Quit Browser");
			
			test.pass("Test Completed");
			
		}
		*/
		public void tearDown(){
			
			extent.flush();
		}

	}

