package firstPacakage;

public class Polymorphism3 extends Polymorphism1 {

	public static void main(String[] args) {

		Polymorphism3 poly =new Polymorphism3();
		poly.trip();
		poly.method11();
		poly.method22(56, 23.12f);
		Polymorphism1 poly1 =new Polymorphism1();
		poly1.method11(23);
		poly1.method22(56, 23.12f);
	}
	private void trip() {
		System.out.println("Trip of Polymorphism3 ");
	}
	public int method11(int a) {

		System.out.println("Inside 1 arg method11 of Polymorphism3 " + a);
		return a;
	}
	public Polymorphism3 method22(int a, float b) {
		System.out.println("Inside 2 arg method22 of Polymorphism3 " + a + b);
		return new Polymorphism3();
	}
	public static void  method44(){
		System.out.println("Inside static method44 of Polymorphism3 ");
	}
}
