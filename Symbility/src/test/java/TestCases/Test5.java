package TestCases;

import org.testng.annotations.Test;

import TestCaseUtils.TestUtils;
import WebPageObjects.Test2_Objects;
import WebPageObjects.Test3_Objects;
import WebPageObjects.Test5_Objects;

public class Test5 extends TestUtils{
	@Test
	public void addMemoryCardToCart() {
	  reporterOutput(" Test 5 -> Add Memory Card to Card");
	  Test3_Objects testObject3 = new Test3_Objects();
	  testObject3.serachQuery("memory card");
	  
	  Test5_Objects testObject5 = new Test5_Objects();
	  testObject5.click32GBMemoryCard();
	  testObject5.clickAddToCartButton();
	  testObject5.clickProceedToCheckoutButton();
	  
	  Test2_Objects testObject2 = new Test2_Objects();
	  testObject2.enterEmail("symbilitytest@mailinator.com");
	  testObject2.clickContinue();
	  testObject2.enterPassword("SymbilityTest");
	  testObject2.clickSignInSubmit();

	  
  }
}
