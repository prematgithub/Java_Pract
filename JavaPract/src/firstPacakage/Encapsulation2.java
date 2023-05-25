package firstPacakage;

public class Encapsulation2 extends Encapsulation1 {

	public static void main(String[] args) {
		Encapsulation2 emp = new Encapsulation2();
		emp.setInfo(101, "Prem");
		System.out.println("Emp id is "+emp.getInfoID()+" and name "+emp.getInfoName());
	}

}
