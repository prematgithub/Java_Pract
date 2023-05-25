package firstPacakage;

public class InterFace4 implements InterFace3, InterFace3.InterFace31 {

	public static void main(String[] args) {

		System.out.println(" Variable in interface4 a have value " + InterFace3.InterFace31.a);
		// a=15;
		System.out.println(" Variable in interface3 a have value " + InterFace3.b);
		// b=12.557f;
		InterFace3.testing2();
		new InterFace4().testing1();
		

	}

	public void testing1() {
		
		System.out.println("Inside testing1 "+a);
	}
}
