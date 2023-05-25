package logicalProgram;

public class Factorial {
	public static void main(String[] args) {
		int num = 10, temp = 1, mult;

		for (int i = 1; i <= num; i++) {

			mult = temp * i;
			temp = mult;

		}
		System.out.println("Factorial of "+num+" is "+temp);

	}

}
