package logicalProgram;

public class NoIsPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=41,temp;
		boolean isPrime=true;
		System.out.println("Inside Main");
		for(int i=2;i<=n/2;i++) {
			temp=n%i;
//			System.out.println("Inside for");
			if(temp==0) {
				isPrime=false;
				System.out.println(" No is divisible by "+i);
				break;
			}
		}
		if(isPrime) {
			System.out.println(" No is prime number");
		}
		else {
			System.out.println("no Is NOT prime no ");
		}
	}

}
