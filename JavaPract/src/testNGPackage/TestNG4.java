package testNGPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	// Skipping the test cases

	// @Test //skipped
	public void testcase1() {
		System.out.println("testcase1");
	}

	@Test(enabled = false) // skipped
	public void testcase2() {
		System.out.println("testcase2");
	}

	@Test(enabled = true)
	public void method1() {
		System.out.println("Method1");
	}

	@Test(invocationCount = 2)
	public void method2() {
		System.out.println("Method22");
	}

	@Test(invocationCount = 0) // skipped
	public void testcase3() {
		System.out.println("testcase3");
	}

	@Test // skipped and will show skip tests count
	public void testCase4() {
		System.out.println("testCase4");
		throw new SkipException("testCase4 is skipped ");
	}

}
