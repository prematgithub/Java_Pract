package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	//Dependancies
	
	@Test
	public void testCase1() {
		System.out.println("testCase1");
		Assert.assertTrue(3<1);// if this condition is true then only test case is passed
		
	}
	//If above test is passed then only testcase2 gets pass. And if above test gets failed then test case 2 will be skipped
	@Test(dependsOnMethods = "testCase1")
	public void testcase2() {
		System.out.println("testCase2");
	}
	
	@AfterMethod
	public void method11() {
		System.out.println("After method11");
	}
	@BeforeMethod
	public void method12() {
		System.out.println("Before method12");
	}
}
