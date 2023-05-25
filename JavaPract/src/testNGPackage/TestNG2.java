package testNGPackage;

import org.testng.annotations.*;

public class TestNG2 {
	//Tests execution happens in alphanumeric order
	//if class contains main() method and test annotation then JVM will ask for which execution want to perform
	@Test
	public void ab() {
		System.out.println("Method ab");
	}
	@Test
	public void z() {
		System.out.println("Method Z ");
	}
	@Test
	public void aajadi() {
		System.out.println(" Mthod aajadi");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Main method");
	}

}
