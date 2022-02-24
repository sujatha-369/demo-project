package Guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.demo.guru99.com/V4/");
		WebElement userid = driver.findElement(By.name("uid"));
		userid.sendKeys("mngr1336");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("dAnavUq");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		login.click();
		
	}
	

}
