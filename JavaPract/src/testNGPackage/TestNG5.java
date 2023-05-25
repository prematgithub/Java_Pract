package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG5 {

	// using multiple annotation parameters
	@Test
	public void testCase1() {
		System.out.println("testCase1");
	}
	@Test(invocationCount = 2,priority=1,enabled=true)
	public void testcase2() {
		System.out.println("testcase2");
	}

	@Test(priority=2,enabled=false)
	public void testcase3() {
		System.out.println("testcase3");
	}
	@Test(invocationCount = 1,priority=-1)
	public void testcase4() {
		System.out.println("testcase4");
	}
	@Test(enabled=true,priority=1,invocationCount = 1)
	public void testcase5() {
		System.out.println("testcase5");
	}
	@Test(enabled=true,priority=1)
	public void testcase6() {
		System.out.println("testcase5");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeMethod
	public void method1() {
		System.out.println(" Before method1");
	}
	@AfterClass
	public void method2() {
		System.out.println("After Class");
	}
}
