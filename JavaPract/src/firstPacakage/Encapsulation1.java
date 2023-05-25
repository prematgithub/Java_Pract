package firstPacakage;

public class Encapsulation1 {

	// It is a java bean class
	private int empId;
	private String empName;
	String Company;

	public void setInfo(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;

	}

	public int getInfoID() {
		return empId;
	}
	public String getInfoName() {
		return empName;
	}

}
