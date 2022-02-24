package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExamples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);		
		WebElement clickFrame = driver.findElement(By.id("Click"));
		clickFrame.click();
		
		String frameText = clickFrame.getText();
		System.out.println(frameText);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement  clickFrame1 = driver.findElement(By.id("Click1"));
		clickFrame1.click();
		
		driver.switchTo().defaultContent();
		List<WebElement>  totalFrames = driver.findElements(By.tagName("iframe"));
		int size = totalFrames.size();
		System.out.println("Number of Frames" + size);
			
		
	}

}
;
