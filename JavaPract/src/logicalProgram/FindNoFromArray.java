package logicalProgram;

public class FindNoFromArray {

	public static void main(String[] args) {
		int[] arry1 = { 81, 11, 20, 50, 10, 18 };

		int preLargeNo = arry1[0] ,secondLarge=arry1[0];

		// find largest no from array
		for (int tempNo : arry1) {
			
			if (tempNo > preLargeNo) {
				secondLarge=preLargeNo;
				preLargeNo = tempNo;
			}else if(tempNo>secondLarge && tempNo!=preLargeNo) {
				secondLarge=tempNo;
			}

		}
		System.out.println("Largest no in array is "+preLargeNo);
		System.out.println("Second Largest no in array is "+secondLarge);

	}

}
