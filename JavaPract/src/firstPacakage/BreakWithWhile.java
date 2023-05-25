package firstPacakage;

public class BreakWithWhile {

	public static void main(String arg[]) {
		
		int i=10;
		while(i>5) {
			if(i==6) {
				System.out.println("INside IF "+i);
				break;
			}
			System.out.println(i);
			i--;
		}
		System.out.println(" Outside while loop");
	}
}
