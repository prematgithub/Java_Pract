package firstPacakage;

public class Arrays2 {

	public static void main(String[] args) {
		//instantiation of array
		int a[]= new int[5];
		//print defualt value of array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//initialization of an array
		a[0]=20;
		a[4]=45;
		a[2]=22;
		a[1]=8;
		a[3]=11;
		
		//print length of an array
		System.out.println(a.length);//here length is not method its a property of an array.
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
