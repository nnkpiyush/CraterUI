package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseTest extends commons {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	protected static final Logger log = LogManager.getLogger(BaseTest.class);
	public BaseTest() {
		super();
	}
	
	@BeforeSuite
	public void driverInitilization() {
		
		if(config.getBrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			
			driver.set(new ChromeDriver());
		}
		else if (config.getBrowser().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
			driver.set(new FirefoxDriver());
		}
		
		getDriver().manage().window().maximize();
		
	}
	
	
	  public static WebDriver getDriver() { 
		  WebDriver local = driver.get(); 
		  return local; 
		  }
	 
	
	public void clickOnElement(WebElement element) {
		try {
		element.click();
		}
		catch(Exception e) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
		}
	}
	
	 public void writeTextInRTE_Field(WebElement webElement, String text) throws InterruptedException {
	        //log.debug("Typing :" + text + ", on element: " + webElement);
	        try {
	            if (webElement.isEnabled()) {
	                webElement.clear();
	            }
	        } catch (Exception ex) {
	            log.debug("Ignore the exception");
	        }
	        clearAndEnterValue(webElement,text);
	    }

	    public void clearAndEnterValue(WebElement webElement, String text) throws InterruptedException {
	        try {
	            webElement.sendKeys("");
	            Thread.sleep(1000);
	            webElement.sendKeys(text);
	            Thread.sleep(1000);
	        } catch (Exception ex) {
	            //trying the old approach
	            Actions actions = new Actions(getDriver());
	            Thread.sleep(1000);
	            actions.keyDown(webElement, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	            actions.sendKeys(webElement, text).build().perform();
	        }

	    }
	
	public void writeTextInField(WebElement element , String text) {
		System.out.println(element);
		//log.debug("Typing" + text + "on field" + element);
		element.sendKeys(text);
	}
	
	public void navigateTo(String url) {
		getDriver().navigate().to(url);
	}
	
	public boolean isVisible(WebElement element) {
		boolean visible = false;
		try {
		if(element.isDisplayed()) {
			visible = true;
		}
		}
		catch(Exception e){
			visible = false;
		}
		
		return visible;
	}
	
	public void waitForElement(WebElement element) {
		boolean visible = false;
		//int pollingDuration = config.getPollingDuration();
		//int timeoutForWait = config.getTimeoutForWait();
		int pollingDuration = 500;
		int timeoutForWait = 5;
		
		for(int i =0;i<timeoutForWait;i++) {
			try {
			visible = element.isDisplayed();
			if(visible) {
				break;
			}
			}
			catch(Exception e) {
				System.out.println("element not found" + e);
			}
			try {
				Thread.sleep(pollingDuration);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void clickonElement(WebElement element) {
		element.click();
	}
	
	@AfterSuite
	public void tearDown() {
		getDriver().quit();
	}
	
	
	

}
