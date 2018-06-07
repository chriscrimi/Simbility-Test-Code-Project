package TestCases;

import org.testng.annotations.Test;
import TestCaseUtils.TestUtils;
import WebPageObjects.Test1_Objects;

public class Test1 extends TestUtils{
	@Test
	  public void Test1_Hello_Sign_In_Your_Account_Is_Displayed() {
		  reporterOutput(" Test 1 -> Check if 'Test1 Hello Sign In Your Account Is Displayed'");
		  TestUtils Test1 = new TestUtils();
		  Test1_Objects testObject1 = new Test1_Objects();
		  if (Test1.checkIfSignedOutIsTrue()){
			  testObject1.checkHelloSignInYourAccountIsDisplayed();
		  }else {
			  testObject1.signOut();
		  }
	  }
}