package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.Test;

public class ParallelTesting {
  @Test
 
		public void openBing() {
	  
	  		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.google.co.uk/");
			driver.quit();
		}
		
		@Test
		public void openGoogle() {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.google.co.uk/");
			driver.quit();
		}	
  }
