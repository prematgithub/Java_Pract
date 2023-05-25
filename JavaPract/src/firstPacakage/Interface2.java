package firstPacakage;

public class Interface2 implements Interface1 {

	public void inter1() {
		System.out.println("Inside inter1 ");
	}

	public void inter2() {
		System.out.println("Inside inter2 ");
	}

	public void inter3() {
		System.out.println("Inside inter3 ");
	}
	public static void main(String[] args) {
		Interface2 ch1= new Interface2();
		ch1.inter1();
		ch1.inter2();
		ch1.inter3();
	}
}
