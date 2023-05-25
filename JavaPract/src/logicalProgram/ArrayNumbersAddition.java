package logicalProgram;

public class ArrayNumbersAddition {

	public static void main(String[] args) {
		int[] a= {12,15,20,10,30};
		int[] b= {10,20,30,40,50};
		if(a.length==b.length) {
			int[] c=new int[a.length];
			for(int i=0;i<a.length;i++) {
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
		}

	}

}
