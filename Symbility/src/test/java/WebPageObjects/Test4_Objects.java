package WebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCaseUtils.TestUtils;

public class Test4_Objects extends TestUtils{

	public void checkIferrorMessageExists() {
		this.reporterOutput("Check If 'Hello. Sign In. Your Account' is displayed in the top right corner");
		this.getErrorMessage().getText().contains("did not match any products");
	}
	
	private WebElement getErrorMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"noResultsTitle\"]"));
	}

}
