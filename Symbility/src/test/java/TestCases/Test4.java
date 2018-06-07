package TestCases;

import org.testng.annotations.Test;

import TestCaseUtils.TestUtils;
import WebPageObjects.Test3_Objects;
import WebPageObjects.Test4_Objects;

public class Test4 extends TestUtils{
	@Test
	public void inputInvalidQuery() {
	  reporterOutput(" Test 4 -> Search for [alpja]");
	  Test3_Objects testObject3 = new Test3_Objects();
	  Test4_Objects testObject4 = new Test4_Objects();

	  testObject3.serachQuery("[alpja]");
	  testObject4.checkIferrorMessageExists();
  }
}
