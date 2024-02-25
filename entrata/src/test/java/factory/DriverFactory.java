/* This file specifically used for driver initializaion, 
 * retrieving data from properties file to run test cases on specific browser */
package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DriverFactory {
	
	static WebDriver driver=null;
	private DriverFactory driverFactory;
	
	public WebDriver initializeBrowser(String browserName)
	{
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		//	//WebDriver driver = new ChromeDriver();

//			WebDriverManager.chromedriver().setup();
//			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			 driver = new EdgeDriver();
		}
		else if(browserName.equals("safari"))
		{
			 driver = new SafariDriver();
		}
		driverFactory = new DriverFactory();
		driver= driverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		return driver;
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}
