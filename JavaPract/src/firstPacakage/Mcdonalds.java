package firstPacakage;

public class Mcdonalds extends DisplayScreen {
	
	Mcdonalds()
	{
		System.out.println("What would you like Order?");
	}
	float b,f;
	float burger(String order) {
		System.out.println(" Mac egg burger--->65");
		return b=65f;
	}

	float fries(String order) {
		System.out.println(" Medium Fires --->50");
		return f=50f;
	}

	void billAmount(float b, float f) {
		System.out.println("Total bill amount is "+(f+b));
	}
	
}
