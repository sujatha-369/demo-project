package DemoPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openGoogle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		FileInputStream inputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String browser = properties.getProperty("browser");
	    String driverLocation = properties.getProperty("DriverLocation");
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();			
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();	
		}
		
		driver.get("https://www.google.co.uk/");
	}

}
