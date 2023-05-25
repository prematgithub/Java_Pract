package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions2 {
	@Test
	public void assertTest1() {
		int a=10,b=20;
		String expected="Pune", actual="Pune";
		//Scope of assertions is limited to method/test in which it is used
		//if assertion gets failed then further line of code is not run
		
		Assert.assertEquals(actual,expected,"actual and expected assertion is not matched");
		System.out.println("Equal Assertion is passed");
		
		Assert.assertTrue(a<b, "a is greater than b");
		System.out.println("True Assertion is passed");
		
		Assert.assertFalse(a>b,"a is less than b" );
		System.out.println("false Assertion is passed");
		
	}
	@Test
	public void assertTest2() {
		System.out.println("Inside test case 2");
	}

}
