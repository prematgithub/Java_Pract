package firstPacakage;

public class Student {

	int rollno,marks;
	String name;
	Student(String n,int r ) {

		System.out.println("Welcom to sinhgad");
		rollno=r;
		name=n;
		
	}

	public static void main(String[] args) {
		Student stud1 = new Student("Mayur", 101);
		
		System.out.println("Name of student " + stud1.name + " Haveing Rollno " + stud1.rollno);

		Student stud2=new Student("akash",102);
		System.out.println("Name of student " + stud2.name + " Haveing Rollno " + stud2.rollno);
		Student stud3=new Student("prem",103);
		System.out.println("Name of student " + stud3.name + " Haveing Rollno " + stud3.rollno);

		//System.out.println("Name of student " + t1.name + " Haveing Rollno " + t1.rollno);

		
		//System.out.println("Name of student " + t1.name + " Haveing Rollno " + t1.rollno);

	}

}
