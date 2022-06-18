package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class HomePage extends BaseTest {

	
	@FindBy(xpath = "//img[@src='https://demo.craterapp.com/build/img/default-avatar.jpg']")
	public WebElement Avatar;
	
	public HomePage() {
		super();
	}
	
	public boolean isAvatarVisible() {
		waitForElement(Avatar);
		return isVisible(Avatar);
	}

	
	
}
