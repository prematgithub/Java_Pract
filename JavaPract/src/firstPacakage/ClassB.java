package firstPacakage;

public class ClassB extends ClassA {

	String str;
	float f;
	int a;
	{
		System.out.println("inside ClassB instance ");
		f = 10.23f;
		str = "Hello";
		this.a = 25;
	}
	static {
		System.out.println("Inside Staic block of ClassB");
	}

	ClassB(float f, String str) {

		System.out.println("inside ClassB constructor ");
		this.f = f;
		this.str = str;
	}

	ClassB() {
		this(12.47f, "Prem");
		System.out.println("inside ClassB  default constructor ");
	}

	void method2(float f, int a) {
		System.out.println(f);
		System.out.println(this.f);
		System.out.println(str);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

}
