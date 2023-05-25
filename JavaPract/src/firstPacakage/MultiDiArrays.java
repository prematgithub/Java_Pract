package firstPacakage;

public class MultiDiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{4,5,6,7},{8,9,1,5}};
		//no of rows
		int row=a.length;
		System.out.println(row);
		
		//no of column
		int column=a[0].length;
		System.out.println(column);
		
		//printing values of multi di array
		//outer loop is of row
		for(int i=0;i<row;i++) {
			//inner loop is column
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
