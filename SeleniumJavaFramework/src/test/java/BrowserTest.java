import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath:"+projectPath);
		
		//System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","D:\\Java Programs\\SeleniumJavaFramework\\Drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com/");
		
		//driver.findElement(By.id("q")).sendKeys("Dance with Madhuri");

		driver.findElement(By.name("q")).sendKeys("Dance with Madhuri");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		List<WebElement> listOfInputElemets = driver.findElements(By.xpath("//input"));
		
		int count=listOfInputElemets.size();
		
		System.out.println("Count of input elements:"+count);
		
		//WebElement textBox= driver.findElement(By.id("q"));
		//textBox.sendKeys("Automation step by step");
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
