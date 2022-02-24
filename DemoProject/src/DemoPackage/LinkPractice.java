package DemoPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.leafground.com/pages/Link.html");
		driver.get("http://www.leafground.com/pages/Edit.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//driver.findElement(By.partialLinkText("Home Page")).click();
		driver.findElement(By.id("email")).sendKeys("test@gmail.co.uk");
		
		
		
	}
}
