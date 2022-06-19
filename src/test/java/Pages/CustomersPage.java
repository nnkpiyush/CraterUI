package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class CustomersPage extends BaseTest {

	
	@FindBy(xpath = "//div[@class='flex items-center']/div//following-sibling::button")
	public WebElement newCustomer;
	

	
	public CustomersPage() {
		super();
	}
	
	public CustomersPage onClickNewCustomer() {
		waitForElement(newCustomer);
		clickonElement(newCustomer);
		return this;
	}
	
	
}
