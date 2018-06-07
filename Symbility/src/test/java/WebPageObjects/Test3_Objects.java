package WebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCaseUtils.TestUtils;

public class Test3_Objects extends TestUtils{

	public void serachQuery(String query) {
		this.reporterOutput("Check If 'Hello. Sign In. Your Account' is displayed in the top right corner");
		this.getSearchBarId().sendKeys(query);;
	}
	
	private WebElement getSearchBarId() {
		return this.driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	}

}
