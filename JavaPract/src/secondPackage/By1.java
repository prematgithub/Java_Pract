package secondPackage;

public class By1 implements WebElement1 {
	static By1 classname() {
		return new By1();
	}
	static By1 name() {
		return new By1();
	}
	static By1 xpath(String xpath) {
		System.out.println("you are using Xpath ");
		return new By1();
	}
	
	public void click1() {
		System.out.println("Clicking the webelement");
	}

}
