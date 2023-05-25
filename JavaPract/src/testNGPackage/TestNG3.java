package testNGPackage;

import org.testng.annotations.Test;

public class TestNG3 {
	// Priority executes in ascending order. If we don't set priority its default zero.
	// If priority is same then execution happens in alphanumeric order

	@Test(priority = -15)
	public void testCase1() {
		System.out.println(" testCase1");

	}

	@Test(priority = 1)
	public static void method1() {
		System.out.println("method1");
	}

	@Test(priority = 0)
	public void ice() {
		System.out.println("Ice");
	}

	@Test(priority = 0)
	public void method2() {
		System.out.println("method2");
	}

	@Test()
	public void net() {
		System.out.println("Net");
	}
}
