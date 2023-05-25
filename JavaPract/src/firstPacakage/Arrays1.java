package firstPacakage;


public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,6,8,4,100}; //int array
		String b[]= {"Prem","Akash"};
		System.out.println(a[0]);//1
		System.out.println(b[0]);//Prem
		System.out.println(a[2]);//6
		System.out.println(b[1]);//Akash
		
		Object c[]= {1,5,6,"Prem","akash",'a','b','c',3>12 };
		System.out.println(c[1]);//5
		System.out.println(c[3]);//prem
		//System.out.println(c[18]);// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		
		
	}

}
