package school;

import human.Worker;

public class Pupil implements Comparable<Pupil>{	
	private String name = null;
	private int number = 0;
	
	public Pupil () {
		
	}
	public Pupil (String name) {
		this(name,0);
	}
	public Pupil (String name, int number) {
		this.name = name;
		this.number = number; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	

	public int compareTo(Pupil pupil) {
		if (this.getNumber() < pupil.getNumber()) {
			return -1;
		}
		if (this.getNumber() > pupil.getNumber()) {
			return 1;
		} else {
			return 0;
		}

	}
}
