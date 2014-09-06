package student;

public class StudentTest {
	
	public static void main (String [] args){
		Student Pesho = new Student ("Peter Petkov");
		Pesho.printAllInfo();
		Student Svilen = new Student ("Svilen Pavlov Valkanov", 4,'U','A',"svilkata91@gmail.com","08956241");
		Svilen.printAllInfo();
		System.out.print(Svilen.getUniversityShort());
		System.out.print(Svilen.getSubjectShort());		
		Student Dinko = new Student ("Kostadin Ivanov Milev" , 4);
		Dinko.printAllInfo();
		Student Galq = new Student();		
		Galq.printAllInfo();
		Student Ina = new Student ("Inna Koleva",0,'H','E',"A","");
		Ina.printAllInfo();
		System.out.print("The number of students are: "+ Student.getNumberOfStudents());		
	}
	
}
