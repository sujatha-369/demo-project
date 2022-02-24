package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("London");
		driver.findElement(By.id("phone")).sendKeys("4487983409239");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("itera");
	    driver.findElement(By.id("address")).sendKeys("123, Robort Avenue, London");
	    driver.findElement(By.name("submit")).click();
	    
	    
	    
       
	}

}
