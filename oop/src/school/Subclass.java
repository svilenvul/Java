package school;

import java.util.HashSet;

public class Subclass extends Class{
	private char classID;	
	
	public Subclass (int classNumber,char classID) {
		super(classNumber);
		this.classID = classID;
	}

	public char getClassID() {
		return classID;
	}

	public void setClassID(char classID) {
		this.classID = classID;
	}	

}
