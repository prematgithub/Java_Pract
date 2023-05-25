package firstPacakage;

public class Polymorphism2 extends Polymorphism1 {

	Polymorphism2(){
		System.out.println("Inside default constr");
	}
	Polymorphism2(String towWheelr){
		System.out.println("Inside argument constr");
	}
	Polymorphism2(int four){
		System.out.println("Inside int  argument constr");
	}
	Polymorphism2(int a, float d){
		System.out.println("Inside int and float  argument constr");
	}
	public static void method112(float b) {

		System.out.println("Inside 1 arg method of Child "+b);
	} 
	
	public static void main(String[] args) {
		System.out.println("Start");
		new Polymorphism2().paymentt('o');;
	}
	 void paymentt(char card) {
			System.out.println("Inside poly method of Child");
			method112(45.788f);
		}

}
