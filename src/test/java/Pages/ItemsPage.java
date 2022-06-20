package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;


public class ItemsPage extends BaseTest {

	
	@FindBy(xpath = "//div[@class='flex items-center']/div//following-sibling::button")
	public WebElement addItems;
	

	
	public ItemsPage() {
		super();
	}
	
	public ItemsPage onClickAddItems() {
		waitForElement(addItems);
		clickonElement(addItems);
		return this;
	}
	
	
}
