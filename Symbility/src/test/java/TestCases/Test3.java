package TestCases;

import org.testng.annotations.Test;

import TestCaseUtils.TestUtils;
import WebPageObjects.Test3_Objects;

public class Test3 extends TestUtils{
	@Test
	public void inputMemoryCard() {
	  reporterOutput(" Test 3 -> Search for memory card");
	  Test3_Objects testObject3 = new Test3_Objects();
	  testObject3.serachQuery("memory card");
  }
}
