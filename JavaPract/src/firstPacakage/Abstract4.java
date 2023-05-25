package firstPacakage;

public class Abstract4 extends Abstract3 {

	String str="asadfg ";
	public static void main(String[] args) {
		Abstract4 ab4= new Abstract4();
		
		System.out.println(ab4.str.toString());
		System.out.println(ab4);
		System.out.println(ab4.toString("Mayur"));
		ab4.test1();
		ab4.test2();
		ab4.test3();
	}

	void test1() {
		System.out.println("Inside Method Test 1");
	}
	void test2() {
		System.out.println("	Inside Method Test 2");
	}
	void test3() {
		System.out.println("		Inside Method Test 3");
	}
	public String toString(String str) {
		return str;
	}
}

