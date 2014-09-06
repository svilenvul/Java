package school;

public class Discipline {
	private String name = null;
	private int numberLesseons = 0;
	private int numberExercises = 0;
	
	public Discipline (String name) {
		this(name, 0);
	}
	public Discipline (String name, int numberLessons) {
		this(name, numberLessons, 0);
	}
	public Discipline (String name, int numberLessons, int numberExercises) {
		this.name = name;
		this.numberLesseons = numberLessons;
		this.numberExercises = numberExercises;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberLesseons() {
		return numberLesseons;
	}
	public void setNumberLesseons(int numberLesseons) {
		this.numberLesseons = numberLesseons;
	}
	public int getNumberExercises() {
		return numberExercises;
	}
	public void setNumberExercises(int numberExercises) {
		this.numberExercises = numberExercises;
	}				
}	
