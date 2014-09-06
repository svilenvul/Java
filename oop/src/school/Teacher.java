package school;

public class Teacher {
	private String name = null;
	private Discipline discipline;
	private Class clas;
	
	public Teacher() {
		
	}
	public Teacher (String name,Discipline disciplines) {
		this.name = name;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}			
}
