package firstPacakage;

public class Abstract2 extends Abstract1 {

	public static void main(String[] args) {

		Abstract2 ab2 = new Abstract2();
		ab2.abMethod();
		ab2.abMethod2();
	}

	void abMethod() {
		System.out.println(" Inside abstract method of child");
	}
	

}
