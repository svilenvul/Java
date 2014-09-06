package filesystem;

public abstract class File implements Comparable<File>{
	private String name = null;
	private String dateOfCreation = null;
	private String dateOfLastChange = null;
	
	File (String name, String dateOfCreation, String dateOfLastChange) {
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.dateOfLastChange = dateOfLastChange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getDateOfLastChange() {
		return dateOfLastChange;
	}

	public void setDateOfLastChange(String dateOfLastChange) {
		this.dateOfLastChange = dateOfLastChange;
	}
	
	@Override
	public int compareTo (File other) {
		int nameDiff = name.compareTo(other.name);
		return nameDiff;
	}	
}
