package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicTest1 {

	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" beforeClass");
	}

	@Test
	public void a1() {
		System.out.println("Executing first test a1");
	}

	@Test
	public void a2() {
		System.out.println("Executing Method -A2");
		for (char x = 'a'; x <= 'd'; x++) {
			System.out.println(x);
		}
	}

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("	beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("  	afterMethod");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("  beforeSuite");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");

	}

}
