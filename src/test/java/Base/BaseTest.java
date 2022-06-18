package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import jdk.internal.org.jline.utils.Log;

public class BaseTest extends commons {
	//private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	WebDriver driver;
	
	public BaseTest() {
		super();
	}
	
	@BeforeSuite
	public void driverInitilization() {
		Log.debug(" RUNNING BEFORE SUITE");
		if(config.getBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (config.getBrowser().equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
	}
	
	
	
	

}
