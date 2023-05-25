package firstPacakage;

public class Polymorphism4 extends Polymorphism3 {

	int a4 = 45;

	Polymorphism4(){
		System.out.println("Inside 0 arg Constructor of Polymorphism4 ");
	}
	
	public static void main(String[] args) {
		Polymorphism4 obj1= new Polymorphism4();
		obj1.trip();
		//up casting
		Polymorphism1 obj2= new Polymorphism4();
		obj2.paymentt();
		//obj2.method33(); // can't access child method as up casting is done
		
		Polymorphism3 obj21= (Polymorphism3)obj1;
		obj21.method11(556);
		obj21.method44();
		
		Polymorphism4 obj22= (Polymorphism4)obj21;
		obj22.method33();
		obj22.method44();
	}
	void paymentt() {
		System.out.println("Inside paymentt method of Polymorphism4 ");
	}

	public void trip() {
		System.out.println("Trip of Polymorphism4 ");
	}

	 void paymentt(int i) {
		System.out.println("Trip of paymentt of Polymorphism4 ");
		
	} 
	public void method33() {
		System.out.println("method33 of paymentt of Polymorphism4 ");
	}
	public static void  method44(){
		System.out.println("Inside static method44 of Polymorphism4 ");
	}
}
