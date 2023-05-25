package firstPacakage;

import java.util.Scanner;

public class Customer extends Mcdonalds {
	public static void main(String[] args) {
		Customer cmr1 = new Customer();
		System.out.println("Pleas select  your meal.");
		Scanner orders= new Scanner(System.in);
		String order1 =orders.next();
		String order2 =orders.next();
		System.out.println("You have selected "+order1+" and "+order2);
		float burgerPrice = cmr1.burger(order1);
		float friesPrice = cmr1.fries(order2);
		System.out.println(cmr1.compDrink());
		cmr1.billAmount(burgerPrice, friesPrice);
		System.out.println("Please wait for your order");
	}

}
