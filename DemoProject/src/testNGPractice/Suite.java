package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Suite {
	
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
			
	}
	
	@Test
	public void openGoogle() throws InterruptedException {
		driver.get("https://www.google.co.uk/");
		Thread.sleep(1000);
		
	}
  
	@Test
	public void openBing() throws InterruptedException {
		driver.get("https://www.bing.com/");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void openYahoo() {
		driver.get("https://uk.yahoo.com/");
		
	}
	
	@AfterSuite
	public void closeBrowser() {
	  driver.quit();
	  endTime = System.currentTimeMillis();
	  long totalTime =  startTime - endTime;
	  System.out.println("Total time is "+totalTime);
	  		
	}
}
