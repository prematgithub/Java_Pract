package firstPacakage;

public class BreakStatementWthDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do{
			System.out.println(i);
			if(i==3)
			{System.out.println(" Inside if "+i);
			break;
			}
			i++;
		}while(i<5);

	}

}
