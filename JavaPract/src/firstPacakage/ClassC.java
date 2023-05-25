package firstPacakage;

public class ClassC extends ClassA {

	char ch = 'P';
	int a = 56;

	static {

		System.out.println("inside static block");
	}
	{

		System.out.println("inside intance  block ClassC");
	}
	
	ClassC() {
		//super(122);
		System.out.println("inside  default constr ClassC");
	}

	ClassC(int g) {
		//super(122);
		System.out.println("inside  default constr ClassC argument");
	}
	public void method3() {
		System.out.println("Insidde method 3 of classC");
		int a = 100;
		System.out.println(a);// 100
		System.out.println(this.a);// 56
		
	}

	public static void main(String[] args) {

		System.out.println("Start from main");
		ClassC c = new ClassC();
		ClassC c2 = new ClassC(13);
		// c.method3();
		//c.method1(46);
		// c.method2(102.33f, 222);// method of ClassB

		System.out.println("Stop");
	}

}
