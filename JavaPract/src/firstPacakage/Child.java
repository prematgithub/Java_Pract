package firstPacakage;

public class Child extends Inheritance {
	Child() {
		this(12);
		System.out.println("Inside Child Constructor");
	}

	Child(int arg) {
		super(45.6f);
		System.out.println("Inside Child Constructor " + arg);
	}

	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		in.m3();
		Child ch = new Child();
		ch.method1();
	}

	public void method1() {
		System.out.println("Inside method1 of Child ");
	}
}
