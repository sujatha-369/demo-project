package DemoPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alertMsg = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alertMsg.accept();
		
		// Confirm Box
		
		WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confrimAlert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		confrimAlert.dismiss();
		
		// prompt Box
		
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		
		Alert promptAlert = driver.switchTo().alert();
	
		
		
		promptAlert.sendKeys("Mass Academy");
		
		Thread.sleep(3000);
		
		promptAlert.accept();
		
	

	}

}
