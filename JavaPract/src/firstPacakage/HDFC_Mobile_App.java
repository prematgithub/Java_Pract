package firstPacakage;

public class HDFC_Mobile_App {

	public static void main(String[] args) {
		System.out.println("Welcom to HDFC");
		Banking c1 = new Banking();
		c1.banking();
		//c1.insurance();
		//c1.credit_card();
		//c1.interestRate();
		c1.deposite(555.36f);
		System.out.println("Current account balance is "+c1.getBalance());
		System.out.println("Fixed deposite is "+c1.fixeddepo());
		c1.widrawal(1000);
		System.out.println("Current account balance is "+c1.getBalance());
	}

}

abstract class Credit_Card implements HDFC {
	public void credit_card() {
		System.out.println("Aplied to HDFC Credit Card");

	}
}

abstract class Insurance extends Credit_Card {
	public void insurance() {
		System.out.println("You have got 1 year  HDFC insurance");
	}
}

class Banking extends Insurance {
	private float bal;
	private final int fixedDeposite=100000;
	Banking() {
		this.bal = 5000;
		System.out.println("You have opened saving account with deposite "+bal);
	}
	

	public void banking() {
		System.out.println("Welcome to HDFC Banking");
	}

	public void interestRate() {
		System.out.println(" we are offering Home loan interest rate  7.8% for your dream home");
	}

	public void deposite(float deposite) {
		bal = bal + deposite;
		System.out.println(deposite + " Are credited to  your account");
	}
	public float getBalance() {
		return bal;
	}
	public int fixeddepo() {
		return fixedDeposite;
	}
	public void widrawal(int WidAmount) {
		this.bal=bal-WidAmount;
		System.out.println("You have widraw "+WidAmount);
		
	}
}
