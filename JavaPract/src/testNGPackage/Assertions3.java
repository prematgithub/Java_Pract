package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions3 {
	
	@Test
	public void testcase11() {
		
		String expected="Pu1ne", actual="Pune";
		
		// If assert statement is surrounded by try catch block then even if assert is failed rest of the code will get executed
		try {
			Assert.assertEquals(actual,expected,"actual and expected assertion is not matched");
		} catch (AssertionError e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Equal Assertion is passed");
	}

}
