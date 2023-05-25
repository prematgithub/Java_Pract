package firstPacakage;

public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=300;
		int b=300;
		if(a!= b)
		{
			System.out.println("a is not equal to b");
		}
		else
		{
			System.out.println("A and b are eqaaul");
		}
		
		String s="HELLO SELENIUM";
		String t="hello selenium";
		// we use eqaul to operator for no comparison but if we compare string, it will be casse sensative.
		
		if(s==t)
		{
			System.out.println("s and t are eqaul ");
		}
		else
		{
			System.out.println("s and t are not equal");
		}
		// 2nd way of string coparison Case sensative
		if(s.equals(t))
		{
			System.out.println("s and t for 2nd way are eqaul ");
		}
		else
		{
			System.out.println("s and t are not for 2nd way equal");
		}
		// 3rd way of string coparison Case sensative
		if(s.equalsIgnoreCase(t))
		{
			System.out.println("s and t for 3rd way are eqaul ");
		}
		else
		{
			System.out.println("s and t are not for 3rd way equal");
		}
	}

}
