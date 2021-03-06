package TestCaseUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestUtils {
	
	private final String reporterLine = "----------------------------------------------------------------------------";
	
	protected WebDriver driver;
	
	public void reporterOutput(String Log){
		System.out.println(Log);
	}
	
	public boolean checkIfSignedOutIsTrue() {
		if (this.getSignOutId().isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void signOut() {
		reporterOutput("Sign Out of Amazon");
		this.getSignOutButton().click();
	}
	
	private WebElement getSignOutId() {
		WebElement element = null;
		element = driver.findElement(By.cssSelector("//a[href='https://www.amazon.ca/ap/signin?']"));
		return element;
	}
	
	private WebElement getSignOutButton() {
		WebElement element = null;
		element = this.driver.findElement(By.cssSelector("#nav-link-yourAccount"));
		return element;
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christian\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.ca");
	  reporterOutput(this.reporterLine);
  }

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  reporterOutput("Done Test");
  }

}
