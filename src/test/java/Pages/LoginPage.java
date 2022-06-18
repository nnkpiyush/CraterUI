package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class LoginPage extends BaseTest {

	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	public LoginPage() {
		super();
	}
	
	public LoginPage enterEmail(String emailId) throws InterruptedException {
		//WebElement ele = getDriver().findElement(By.xpath("//input[@name='email']"));
		writeTextInRTE_Field(email,emailId);
		return this;
	}
	
	public LoginPage enterPassword(String emailpassword) throws InterruptedException {
		writeTextInRTE_Field(password,emailpassword);
		return this;
	}
	
	public LoginPage login(String emailId , String emailpassword) throws InterruptedException {
		enterEmail(emailId);
		enterPassword(emailpassword);
		login.click();
		return this;
	}
	
	
}
