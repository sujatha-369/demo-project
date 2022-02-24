package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select selectIndex = new Select(dropDown1);
		selectIndex.selectByIndex(4);
		
		//Thread.sleep(5000);
		
		//selectIndex.selectByValue("2");
		//Thread.sleep(5000);
		
		//selectIndex.selectByVisibleText("Selenium");
		
		//Get the Number of options in the Dropdown
		
		List<WebElement> listofOptions = selectIndex.getOptions();
		int size = listofOptions.size();
		System.out.println("Number of Elements is " + size);
		
		// select option using sendkeys
		
		dropDown1.sendKeys("Appium");
		
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select multiSelectBox = new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(4);
	
		
		
		

	}

}
