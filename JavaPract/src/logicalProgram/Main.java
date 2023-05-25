package logicalProgram;

public class Main {

	int var;
	static int stc=7;
	public static void main(String s[])
	{
	Main ob1 = new Main();
	ob1.var=9;
	System.out.println("var of ob1 "+ob1.var);

	Main ob2 = new Main();
	ob2.var=90;
	System.out.println("var of ob2 "+ob2.var);

	ob1.stc=ob1.stc+100;

	System.out.println("ob1 "+ob1.stc);

	System.out.println("ob2 "+ob2.stc);

	}

}
