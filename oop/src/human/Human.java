package human;

public class Human {

	private String firstName = null;
	private String familyName = null;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Human(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	public static void main(String[] args) {

	}

}
