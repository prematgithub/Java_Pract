package firstPacakage;

public interface InterFace5 {
	 default void method1() {
		System.out.println("Inside non static method of INterface");
	}
	abstract void method2();

}
