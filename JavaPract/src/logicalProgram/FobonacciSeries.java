package logicalProgram;

public class FobonacciSeries {

	public static void main(String[] args) {
		
		long fiboNum=0,secnum=0, temp=1, num=10;
		for(int i=0;i<=num;i++) {
//			System.out.println(fiboNum);
			fiboNum=secnum;
			secnum=temp;
			temp=fiboNum+secnum;
			System.out.println(fiboNum);
		}
	}

}


