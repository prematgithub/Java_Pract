package logicalProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// check number is Palindrome or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = 0, initialNum = num;
		while (num != 0) {
			temp = temp * 10 + num % 10;
			num = num / 10;
		}
		if (initialNum == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		// Check string PAlindrome
		char c;
		String reverse = "";
		System.out.println("Enter string ");
		String str = sc.next();

		// Using String concatenation(+) operator
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			// System.out.print(c);
			reverse = c + reverse;
			// System.out.println(reverse);
		}
		if (str.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");

		}
	}
}
