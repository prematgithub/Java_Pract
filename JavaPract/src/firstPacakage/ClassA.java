package firstPacakage;

public class ClassA {

	int a = 12;

	public void method1(int a) {
		System.out.println(" Method1 " + a);

	}

	static {
		System.out.println("Inside Staic block of ClassA");
	}
	{
		System.out.println("Inside instance of ClassA");
	}
	

	public ClassA() {

		System.out.println("Inside ClassA constructor");
	}

	public ClassA(int x) {

		System.out.println("Inside ClassA constructor " + x);
	}

}
