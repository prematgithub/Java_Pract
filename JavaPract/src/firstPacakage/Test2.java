package firstPacakage;

public class Test2 {
	int a;
	float b;

	{
		this.a = 222;
		System.out.println("Inside instance block 1 " + a);
	}
	{
		this.b = 333.5f;
		System.out.println("Inside instance block 2 " + b);
	}

	Test2() {
		this(444.5f);
		System.out.println("Inside 0 arg Constructor " + this.b);
	}

	Test2(int arg) {
		this();
		int a = 12345;
		System.out.println("Inside arg Constructor " + a);
		System.out.println("Inside arg Constructor " + arg);
		System.out.println("Inside arg Constructor " + this.a);
		this.a = a;
		System.out.println("Inside arg Constructor " + this.a);

	}

	Test2(float arg) {
		System.out.println("Inside float arg Constructor " + arg);
	}

	public static void main(String[] args) {

		System.out.println("START");
		Test2 t2 = new Test2();
		t2.a = 12;
		t2.b = 12.5f;
		Test2.method1(t2);
		System.out.println("STOP");
	}

	public static void method1(Test2 obj) {

		System.out.println("Inside method1 " + obj.a);
		obj.method2();
	}

	public void method2() {
		int a = 100;
		System.out.println("Inside method2 " + b);
		System.out.println(a);// 100
		System.out.println(this.a);// 12
		Test2 t3 = new Test2(50);
		t3.a = 200;
		System.out.println(t3.a);
		System.out.println(a);// 100
		System.out.println(this.a);// 12
	}

}