package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCustomerPage {
	
WebDriver driver;
	
	public ListCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Liberary
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]") WebElement ADD_CUSTOMER_LIST_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]") WebElement SEARCH_BAR_LIST_CUSTOMER_ELEMENT;
	
	public void clickAddCustomerOnListCustomer() {
		ADD_CUSTOMER_LIST_CUSTOMER_ELEMENT.click();
	}
	
	public void insertInToSearchBar() {
//		AddCustomerPage addCustomer = new AddCustomerPage();
		
		SEARCH_BAR_LIST_CUSTOMER_ELEMENT.sendKeys();
	}

}
