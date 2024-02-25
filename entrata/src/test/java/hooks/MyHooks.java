package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {

	WebDriver driver;
	private ConfigReader configReader;
	private DriverFactory driverFactory;
	@Before
	public void setUp() {
		configReader= new ConfigReader(); 
		Properties prop = configReader.initlizePoperties();
		driverFactory= new DriverFactory();
		driver = driverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
	}

	@After
	public void tearDown(Scenario sc) {
		System.out.println("Tear Down method is invoked.");
		String scenarioName= sc.getName().replace(" ", "_");
		if(sc.isFailed())
		{
			System.out.println("Taking sceenshort section.");

			byte[] screenSort=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenSort, "image/png", scenarioName);
		}
		
		driver.quit();
	}

}
