package logicalProgram;

public class NoSwap {

	public static void main(String[] args) {
		//First way of no swapping using 3rd variable
		int a=10,b=20,temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a after Swap "+a); 
		System.out.println("Value of b after Swap "+b); 
		
		//no swapping without using 3rd variable and -/+
		a=a+b;//20+10=30
		b=a-b;//30-10=20
		a=a-b;//30-20=10
		System.out.println("Value of a after swapping without using 3rd variable "+a); 
		System.out.println("Value of b after swapping without using 3rd variable "+b); 
		
		//no swapping without using 3rd variable and * and / only  if no is no zero
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		System.out.println("Value of a after swapping without using 3rd variable and * and / "+a); 
		System.out.println("Value of b after swapping without using 3rd variable and * and / "+b); 
		
		//Using single statement
		b=a+b-(a=b);
		System.out.println("Value of a after Swap "+a); 
		System.out.println("Value of b after Swap "+b); 
		
		//Using logical XOR ^ operator which internally converts value into binary 
		a=a^b;//20^10=30
		b=b^a;//30^10=20
		a=a^b;//30^20=10
		System.out.println("Value of a after Swap Using logical XOR ^ operator "+a); 
		System.out.println("Value of b after Swap Using logical XOR ^ operator "+b); 
		
	}

}
