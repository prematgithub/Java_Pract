package firstPacakage;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining Object array
		Object a[]= {4,6,44,"Prem",7.8};
		
		//defining String array
		String str[]= {"hello","Akash","Mayur"};
		System.out.println(a[2]);//44
		System.out.println(str[1]);//akash
		
		System.out.println(a.length);
		System.out.println(str.length);
		
		a[2]="Selenium";
		System.out.println(a[2]);
		System.out.println("All values of array");
		for(Object aa:a) {
			//System.out.println(aa);
		}
		System.out.println("Using instanceof");
		for (int i=0;i<a.length;i++) {
		
			if(a[i] instanceof String ) {
				
				System.out.println("This contains string "+a[i]);
			}
			else {
				System.out.println(a[i]);
			}
		}
	}

}
