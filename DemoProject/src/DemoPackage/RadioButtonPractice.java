package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		
		WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		
		boolean unchk = unchecked.isSelected();
		
		boolean chk = checked.isSelected();
		
		System.out.println(unchk);
		System.out.println(chk);

				
		//WebElement below20 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		
		//below20.click();
		
		
		WebElement above20 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
		above20.click();
		
		//WebElement above40 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]");
		
		
		
		
		

	}

}
