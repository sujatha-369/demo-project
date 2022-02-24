package DemoPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileExample {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/upload.html");
		
				
		WebElement uploadButton = driver.findElement(By.name("filename"));
		
		Actions click1 = new Actions(driver);
		
		click1.moveToElement(uploadButton).click().build().perform();
			
		uploadButton.click();
		
		
		StringSelection selection = new StringSelection("C:\\Users\\sujic\\Downloads\\testleaf.xlsx");
		
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//Thread.sleep(2000);
		
		 Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	    
	     //Thread.sleep(2000);
	     //robot.keyPress(KeyEvent.VK_ENTER);
	     //robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		
		
	}

}
