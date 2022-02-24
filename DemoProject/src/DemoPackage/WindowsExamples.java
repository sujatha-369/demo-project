package DemoPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
				
		WebElement openHomeButt = driver.findElement(By.id("home"));
		openHomeButt.click();
		
		Set<String> handles = driver.getWindowHandles();
		
	    for (String newWindows : handles) 
	    {
			driver.switchTo().window(newWindows);
		}
	    
	    WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	    editBox.click();
	    Thread.sleep(3000);
	    driver.close();
	    driver.switchTo().window(oldwindow);
	    
	   WebElement openMultiple = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
	   openMultiple.click();
	   int numberOfWindows = driver.getWindowHandles().size();
	   System.out.println("Number of Opened Windows" + numberOfWindows);
	   	    
	    
	    WebElement dontCloseMe = driver.findElement(By.id("color"));
	    dontCloseMe.click();
	    
	    Set<String> handles1 = driver.getWindowHandles();
	    
	    for (String allWindows : handles1) 
	    {
		   if(!allWindows.equals(oldwindow))
	       {
	    	   driver.switchTo().window(allWindows);
			   driver.close();
	       }
		}
	    
	    
	}

	 

}
