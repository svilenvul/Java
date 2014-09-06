package human;


public class Worker extends Human implements Comparable<Worker> {

	private int wage = 0;
	private int workHours = 0;

	public Worker(String firstName, String familyName, int wage, int workHours) {
		super(firstName, familyName);
		this.wage = wage;
		this.workHours = workHours;
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}	

	double wagePerHour() {
		double result = this.wage / this.workHours;
		return result;
	}

	public int compareTo(Worker worker) {
		if (this.wagePerHour() < worker.wagePerHour()) {
			return -1;
		}
		if (this.wagePerHour() > worker.wagePerHour()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		String formatted = this.getFirstName() + " " + this.getFamilyName()
				+ ":" + this.getWage() + " " + this.getWorkHours() + " "
				+ this.wagePerHour();
		return formatted;
	}
}
