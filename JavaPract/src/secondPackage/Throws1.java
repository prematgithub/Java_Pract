package secondPackage;

public class Throws1 {

	static String str;

	public static void main(String[] args) throws Exception {
		System.out.println("Lets get married");
		marraigeRegistrar();

	}

	static void marraigeOfficer() throws InterruptedException {
		System.out.println("lunch break is going on....WAIT");
		Thread.sleep(5000);
		try {
			System.out.println(str.length());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	static void agent() throws InterruptedException {
		System.out.println("Documents are ready");
		marraigeOfficer();
	}

	static void marraigeRegistrar() throws InterruptedException {
		System.out.println("Welcome to marraige registrar office");
		agent();
	}
}
