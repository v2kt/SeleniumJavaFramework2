package Demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	
	 WebDriver driver=null;
	 String projectPath = System.getProperty("user.dir");
	
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(@Optional String browserName)throws Exception {

		System.out.println("Browser name is:"+browserName);

		if(browserName.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();	

		}
		else if(browserName.equalsIgnoreCase("gecko")){

			System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();	

		}
		else if(browserName.equalsIgnoreCase("IE")){

			System.setProperty("webdriver.ie.driver","D:\\Java Programs\\SeleniumJavaFramework\\Drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();


		}
		else {
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void test1() throws Exception {

		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void tearDown() {
		driver.close();

		System.out.println("Google test run succesfully");

	}


}
