package logicalProgram;

public class ReverseString {

	static char c;
	static String reverse="";
	public static void main(String[] args) {
		String str="Wonderful";
		
		//Using String concatenation(+) operator
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			//System.out.print(c);
			reverse=c+reverse;
			//System.out.println(reverse);
		}
		System.out.println(reverse);
		if(str.length()==reverse.length()) {
			System.out.println("Rversal successful");
		}
		else {
			System.out.println("Rversal is Not successful");
		}
		//using Character array
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("Wonderful Rversal successful "+rev);
		
		
		//Using string buffer class
		String str2="Classmate";
		StringBuffer sbr= new StringBuffer(str2);
		sbr.reverse();
		System.out.println("Classmate Rversal successful "+sbr);

	}

}
