package WebPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCaseUtils.TestUtils;

public class Test5_Objects extends TestUtils{
	
	public void click32GBMemoryCard() {
		this.reporterOutput("click on “Sandisk Ultra 32GB Class 10 SDHC UHS-I Memory Card Up to\r\n" + 
				"80MB, Grey/Black (SDSDUNC-032G-GN6IN)” memory card");
		this.getMemoryCardNames().click();
	}
	
	public void clickAddToCartButton() {
		this.reporterOutput("click on add to cart button");
		this.getAddtoCartButton().click();
	}
	
	public void clickProceedToCheckoutButton() {
		this.reporterOutput("click on proceed to checkout button");
		this.getProceedToCheckoutButton().click();
	}
	
	@SuppressWarnings("unchecked")
	private WebElement getMemoryCardNames() {
        List<WebElement> elements = null;
        elements = (List<WebElement>) driver.findElement(By.xpath("//h2[@class=\"a-size-medium s-inline s-access-title a-text-normal\"]"));
		for (WebElement el:elements) {
			if(el.getText().equals("Sandisk Ultra 32GB Class 10 SDHC UHS-I Memory Card Up to 80MB, Grey/Black (SDSDUNC-032G-GN6IN)")) {
				return el;
			}
			
		}
		return null;
	}
	
	private WebElement getAddtoCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	}
	
	private WebElement getProceedToCheckoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]"));
	}

}
