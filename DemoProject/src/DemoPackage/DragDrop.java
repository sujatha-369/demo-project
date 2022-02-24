package DemoPackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
				
		Actions actions = new Actions(driver);
		//actions.clickAndHold(from).moveToElement(target).release(target).build().perform();
		actions.dragAndDrop(from, target).build().perform();
		
	}

}
