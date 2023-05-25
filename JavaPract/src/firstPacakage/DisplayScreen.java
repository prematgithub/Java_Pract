package firstPacakage;

public abstract class DisplayScreen {

	DisplayScreen(){
		System.out.println("Welcome to McDonalds");
	}
	abstract float burger(String order);

	abstract float fries(String order);

	abstract void billAmount(float b, float f);

	String compDrink() {
		// System.out.println("Free!!!! Complimenry drink from McDonalds");
		return "We have added Complimenry drink from McDonalds";
	}

}
