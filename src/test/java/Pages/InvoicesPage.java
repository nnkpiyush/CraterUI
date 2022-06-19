package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class InvoicesPage extends BaseTest {

	
	@FindBy(xpath = "//div[@class='flex items-center']//following-sibling::button")
	public WebElement filter;
	

	
	public InvoicesPage() {
		super();
	}
	
	public InvoicesPage onClickFilter() {
		waitForElement(filter);
		clickonElement(filter);
		return this;
	}
	
	
}
