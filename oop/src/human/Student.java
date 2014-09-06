package human;


public class Student extends Human implements Comparable<Student> {
	private double note = 0.0;

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Student(String firstName, String familyName, double note) {
		super(firstName, familyName);
		this.note = note;
	}

	public int compareTo(Student student) {
		return this.note > student.note ? 1 : this.note < student.note ? -1 : 0;
	}

	@Override
	public String toString() {
		String formatted = this.getFirstName() + " " + this.getFamilyName()
				+ ":" + this.getNote();
		return formatted;
	}
}
