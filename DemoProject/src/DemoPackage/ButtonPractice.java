package DemoPackage;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPractice {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
			
		// Get postion of the Button
		WebElement getPosButt = driver.findElement(By.id("position"));
		Point xypoint = getPosButt.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		
		System.out.println("X Value is " + xvalue + "  Y Value is " + yvalue);
		
		// Get Color of the Button
		WebElement colorButt = driver.findElement(By.id("color"));
		String backColor = colorButt.getCssValue("background-color");
		System.out.println("Button Colour is :"+backColor);
		
		
		// Get Size of the Button
		WebElement findSize = driver.findElement(By.id("size"));
		int buttHeight = findSize.getSize().getHeight();
		int buttWidth = findSize.getSize().getWidth();
		System.out.println("Height is "+buttHeight + "  Width is " + buttWidth);
		
		// Go to Home Page
		WebElement homeButt = driver.findElement(By.id("home"));
		homeButt.click();
		
		
		
		//Delay execution for 5 seconds to view the maximize operation
		//Thread.sleep(10000);
		
		//driver.quit();

	}

}
