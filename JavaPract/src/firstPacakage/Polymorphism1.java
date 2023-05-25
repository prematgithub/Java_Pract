package firstPacakage;

public class Polymorphism1 {

	
	Polymorphism1() {
		System.out.println("Inside 0 arg Constructor of parent ");
	}

	Polymorphism1(boolean b) {
		System.out.println("Inside 1 arg Constructor of parent " + b);
	}

	public static void main(String[] args) {

		Polymorphism1 poly = new Polymorphism1();
		poly.method11();
		poly.main(14, 45.5f);
	}

	public void main(int i, float f) {
		System.out.println("Inside 2 arg method of parent ");

	}

	public final void  method11() {
		System.out.println("Inside 0 arg method11 of parent ");
		Polymorphism1 poly2 = new Polymorphism1(false);
		poly2.method11(12);
	}

	public int method11(int a) {

		System.out.println("Inside 1 arg method of parent " + a);
		return a;
	}

	public  Polymorphism1 method22(int a, float b) {

		System.out.println("Inside 2 arg method22 of parent " + a + b);
		return new Polymorphism1();
	}

	void paymentt() {
		System.out.println("Inside paymentt method of Parent");
	}

	private void trip() {
		System.out.println("Trip of parent");
	}

	void paymentt(int i) {
		System.out.println("Trip of paymentt of parent ");
		
	}
}
