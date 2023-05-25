package firstPacakage;

public class Breakstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==4 && j==4) {
					System.out.println(i+" is i and j is "+j+" inside IF");
				}
				System.out.println(i+" is i and j is "+j);
			}
			System.out.println(" outside the inner loop");
		}
	}

}
