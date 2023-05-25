package firstPacakage;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 23, 5, 8, 7, 6 };
		Arrays4.m2();
	}

	static void m1(int c[]) {
		System.out.println("Inside method m1");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public static void m2() {
		
		//2D array
		int[][] aa= {{10,22,33},{44,55,66}};
		System.out.println(aa.length);
		for(int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(aa[i][j]+" ");
			}
			System.out.println();
		}
	}
}
