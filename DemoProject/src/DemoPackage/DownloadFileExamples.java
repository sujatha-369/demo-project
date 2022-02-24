package DemoPackage;

import java.io.File;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		
		  		
		WebElement downloadFiles = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]"));
		downloadFiles.click();
		
		File fileLocation = new File("C:\\Users\\sujic\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		
		for (File file : totalFiles) {
			 if (file.getName().equals("testleaf.xlsx")) {
				 System.out.println("File is present in downloads");
				 break;
			 }
	             
		}

	}

}
