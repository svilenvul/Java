package school;

import java.util.ArrayList;
import java.util.HashSet;

public class School {	
	private String name;
	private String address;
	private HashSet<Teacher> teachers;
	private HashSet<Class> classes;
	private Teacher director;

	public School (String name,String address) {
		this.address = address;
		this.name = name;
		this.teachers = new HashSet<Teacher>();
		this.classes = new HashSet<Class>();
		this.director = new Teacher();
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Teacher getDirector() {
		return director;
	}

	public void setDirector(Teacher director) {
		this.director = director;
	}
	
	public boolean addTeacher (Teacher teacher) {
		return this.teachers.add(teacher);
	}
	
	public boolean removeTeacher (Teacher teacher) {
		return this.teachers.remove(teacher);
	}
	
	public boolean addClass (Class  schoolClass) {
		return this.classes.add(schoolClass);
	}
	
	public boolean removeClass (Class schoolClass) {
		return this.classes.remove(schoolClass);
	}
}
