package firstPacakage;

public class BreakStaement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(i==5) {
				System.out.println("Inside If "+i);
				break;
			}
			System.out.println(i);
		}
		System.out.println("Outside the for loop");
	}

}
