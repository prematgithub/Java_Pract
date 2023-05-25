package firstPacakage;

public class InterFace6  extends ClassA  implements InterFace5{

	public static void main(String[] args) {
		InterFace5 intr= new InterFace6();
		intr.method1();
		intr.method2();
	}

	public void method2() {
		System.out.println(" Mthod in Child class");
	}
	private static void method() {
		System.out.println("qwerty");
	}
}
