package realestate;

public class Employee {
	private String names;
	private String position;
	private double lengthOfService;
	
	public Employee (String names, String position, double lengthOfService) {
		this.names = names;
		this.position = position;
		this.lengthOfService = lengthOfService;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getLengthOfService() {
		return lengthOfService;
	}

	public void setLengthOfService(double lengthOfService) {
		this.lengthOfService = lengthOfService;
	}
	
	@Override 
	public String toString() {
		String result = names + ", " + position + ", " + lengthOfService + "years length of service \n";
		return result;
	}
}
