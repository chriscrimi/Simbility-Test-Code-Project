package WebPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


import TestCaseUtils.TestUtils;

public class Test2_Objects extends TestUtils{
	protected WebDriver driver;

	public void clickHelloSignInYourAccountIsDisplayed() {
		this.reporterOutput("click 'Hello. Sign In. Your Account'");
		this.getHelloSignInYourAccountId().click();
	}
	
	public void enterEmail(String email) {
		this.reporterOutput("enter email");
		this.getEmailField().sendKeys(email);
	}
	
	public void clickContinue() {
		this.reporterOutput("click continue button");
		this.getContinueButton().click();
	}
	
	public void clickSignInSubmit() {
		this.reporterOutput("click sign in submit");
		this.getSignInSubmitButton().click();
	}
	
	public void enterPassword(String password) {
		this.reporterOutput("enter password");
		this.getPasswordField().sendKeys(password);
	}
	
	private WebElement getHelloSignInYourAccountId() {
		return this.driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
	}
	
	private WebElement getEmailField() {
		return this.driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
	}
	
	private WebElement getContinueButton() {
		return this.driver.findElement(By.xpath("//input[@id=\"continue\"]"));
	}
	
	private WebElement getPasswordField() {
		return this.driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
	}
	
	private WebElement getSignInSubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	}
	
}