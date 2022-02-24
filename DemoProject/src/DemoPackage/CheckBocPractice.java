package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBocPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement javachk = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		javachk.click();
		
        WebElement sqlchk = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
        sqlchk.click();		
        
        WebElement ischk = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
        boolean status = ischk.isSelected();
        System.out.println(status);
        
        WebElement firstElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
        if (firstElement.isSelected())
        {
        	firstElement.click();
        }
        
        
        WebElement secondElement = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
        
        if (secondElement.isSelected()) 
        {
        	secondElement.click();
        }       
       
                
		 
	}

}
