package logicalProgram;

public class EligibleForMarriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		char gender='M';
		if((age>=21 & gender=='M')||(age>=18 & gender=='F')) {
			System.out.println("You are eligible for marraige");
		}
		else {
			System.out.println("You are NOT eligible for marraige");
		}
		
	}

}
