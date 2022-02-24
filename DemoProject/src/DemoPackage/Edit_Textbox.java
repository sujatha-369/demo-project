package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		//driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("London");
        //String value = driver.findElement(By.name("username")).getAttribute("value");
        //System.out.println(value);
        //driver.findElement(By.name("username")).clear();
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("London");
		
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
	}

}
