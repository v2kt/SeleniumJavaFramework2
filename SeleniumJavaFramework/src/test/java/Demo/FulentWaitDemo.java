package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FulentWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		FulentWaits();
		
	}

	
	public static void FulentWaits() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\SeleniumJavaFramework\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("abcd");
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.id("btnk")).sendKeys(Keys.RETURN);
	
		//driver.findElement(By.id("lga")).click();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	    driver.findElement(By.id("lga")).click();
		
		driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(2, TimeUnit.SECONDS) 		
				.ignoring(NoSuchElementException.class);

				WebElement element=wait.until(new Function<WebDriver, WebElement>() {
				private WebElement linkElement;

				public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.linkText("abcd"));
				
				
				if(linkElement.isEnabled()) {
					
					System.out.println("Element Found");
				}
				
				return linkElement;
				}
				});
		
				
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
	}

}
