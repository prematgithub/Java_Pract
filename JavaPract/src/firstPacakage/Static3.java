package firstPacakage;

public class Static3 {

	int rollNo;
	String name;
	static String college="SKNCOE";
	Static3(int r,String s){
		rollNo=r;
		name=s;
		
	}
	public void getResult() {
		System.out.println("RollNo is "+ rollNo +" Name is "+name+" college name is "+college);
	}
}
