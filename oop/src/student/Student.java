package student;

public class Student {
	
	private String names = null;
	private int course = 0;
	private char universityShort = 'N';
	private char subjectShort = 'N';		
	private String email = null;
	private String telNum = null; 
	private static int numberOfStudents = 0;
	Subjects Subject = Subjects.valueOf (Character.toString (subjectShort));
	Universitys University = Universitys.valueOf (Character.toString (universityShort));
	public enum Subjects {
		N("No data"), A("Architecutre"), E("Engeneering"), G("Geodesy"), U("Urban Planning");	
		
		private String convert;
		private Subjects (String convert){			
				this.convert = convert;			
		}
	}
	public enum Universitys {
		N("No data"),U("University of Architecture,Geodesy and Civil Engeneering"),
		S("Sofia University"), 
		T("Technical Univeristy"), 
		H("University of Chemical Technology and Metallurgy");
		
		private String convert;
		private Universitys (String convert){
			this.convert = convert;
		}
	}
	
	Student () {
		this(null);
	}	
	Student (String names) {
		this(names, 0);
	}	
	Student (String names, int course) {
		this(names, course, 'N');
	}	
	Student (String names, int course, char universityShort) {
		this(names, course, universityShort, 'N');
	}	
	Student (String names, int course, char universityShort, char subjectShort) {
		this(names, course, universityShort, subjectShort, null);
	}	
	Student (String names, int course, char universityShort, char subjectShort, String email){
		this(names, course, universityShort, subjectShort, email, null);
	}	
	Student (String names, int course, char universityShort, char subjectShort, String email, String telNum) {
		this.names = names;
		this.course = course;
		try {
			this.University = Universitys.valueOf(Character.toString(universityShort));		
			this.Subject = Subjects.valueOf(Character.toString(subjectShort));
		}catch (IllegalArgumentException e) {
			throw new RuntimeException("Invalide type value.");
		}
		this.email = email;
		this.telNum = telNum;		
		numberOfStudents++;
	}
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}	
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	public static void setNumberOfStudents(int numberOfStudents) {
		Student.numberOfStudents = numberOfStudents;
	}	
	public char getSubjectShort() {
		return subjectShort;
	}
	public void setSubjectShort(char subjectShort) {
		this.subjectShort = subjectShort;
	}
	public char getUniversityShort() {
		return universityShort;
	}
	public void setUniversityShort(char universityShort) {
		this.universityShort = universityShort;
	}
	
	void printAllInfo () {
		System.out.println("Pupil names are: " + this.names);
		System.out.println("Pupil course is: " + this.course);
		System.out.println("Pupil university is: " + this.University.convert);
		System.out.println("Pupil subject is: " + this.Subject.convert);		
		System.out.println("Pupil email is: " + this.email);
		System.out.println("Pupil telephone is: " + this.telNum);
		System.out.println(" ");
	}	
}
