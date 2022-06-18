package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	public LoginTest() {
		super();
	}
	
  @Test
  public void loginTest() throws InterruptedException {
	// page initilization
	LoginPage loginpage = PageFactory.initElements(getDriver(), LoginPage.class);
	HomePage homepage = PageFactory.initElements(getDriver(), HomePage.class);
	
	// navigate to login page
	navigateTo(config.getLoginUrl());
	loginpage.login(config.getUsername(), config.getPassword());
	
	// Assert login is successful
	Assert.assertTrue(homepage.isAvatarVisible());
  }
  
	
}
