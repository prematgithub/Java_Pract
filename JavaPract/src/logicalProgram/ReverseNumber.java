package logicalProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, rev = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		num=sc.nextInt();

		//Using while loop
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is " + rev);
		num=rev;
		
		//Using string buffer class
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse=sb.reverse();
		//System.out.println(num);
		System.out.println("Reverse number uning string buffer class  is " + reverse);
		
		//using String Builder class
		StringBuilder sblr=new StringBuilder();
		sblr.append(num);
		StringBuilder revert=sblr.reverse();
		System.out.println("Reverse number uning string Builder class  is " + revert);

	}

}
