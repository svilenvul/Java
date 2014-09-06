package school;


import java.util.HashSet;
import java.util.TreeSet;

class Class {	
	private int classNumber;
	private Teacher classTeacher;
	private TreeSet<Pupil> pupils;
	
	public Class (int classNumber) {
		this.classNumber = classNumber;
		this.pupils = new TreeSet<Pupil>();
		this.classTeacher = new Teacher();
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}	
	
	public boolean addPupil(Pupil pupil) {
		return this.pupils.add(pupil);
	}
	
	public boolean removePupul(Pupil pupil) {
		return this.pupils.remove(pupil);
	}
}	
