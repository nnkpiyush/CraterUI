package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class HomePage extends BaseTest {

	
	@FindBy(xpath = "//img[@src='https://demo.craterapp.com/build/img/default-avatar.jpg']")
	public WebElement Avatar;
	
	@FindBy(xpath = "//div[@class='py-1']/a/following-sibling::a")
	public WebElement logout;
	
	public HomePage() {
		super();
	}
	
	public boolean isAvatarVisible() {
		waitForElement(Avatar);
		return isVisible(Avatar);
	}
	
	public HomePage waitForDashboardtoLoad() {
		waitForElement(Avatar);
		return this;
	}
	
	public HomePage clickonAvatar() {
		waitForElement(Avatar);
		clickonElement(Avatar);
		return this;
	}
	
	public HomePage clickonLogout() {
		waitForElement(logout);
		clickonElement(logout);
		return this;
	}

	
	
}
