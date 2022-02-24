package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement autoComp = driver.findElement(By.id("tags"));
		autoComp.sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement>  listOption  = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for (WebElement webElement : listOption) 
		{
			if (webElement.getText().equals("Web Services"))
			{
			   webElement.click();
			   break;
				
			}
		}
				
	}

	private static void If(boolean equals) 
	{
		// TODO Auto-generated method stub
		
	}

}
