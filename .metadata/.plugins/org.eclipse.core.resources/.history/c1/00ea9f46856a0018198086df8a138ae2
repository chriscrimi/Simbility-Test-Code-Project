package TestCases;

import org.testng.annotations.Test;

import TestCaseUtils.TestUtils;
import WebPageObjects.Test1_Objects;
import WebPageObjects.Test2_Objects;

public class Test2 extends TestUtils{
	@Test
	public void SignInToAmazon() {
	  reporterOutput(" Test 2 -> Sign into amazon");
	  TestUtils Test1 = new TestUtils();
	  Test1_Objects testObject1 = new Test1_Objects();
	  
	  if (Test1.checkIfSignedOutIsTrue()){
		  testObject1.checkHelloSignInYourAccountIsDisplayed();
	  }else {
		  testObject1.signOut();
	  }
	  
	  Test2_Objects testObject2 = new Test2_Objects();
	  testObject2.clickHelloSignInYourAccountIsDisplayed();
	  testObject2.enterEmail("symbilitytest@mailinator.com");
	  testObject2.clickContinue();
	  testObject2.enterPassword("SymbilityTest");
	  testObject2.clickSignInSubmit();
	}
}
