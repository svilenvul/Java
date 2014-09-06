package human.test;

import human.Student;

import java.util.Arrays;

public class SortStudentsByNoteTest {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("Peter", "Petkov", 4.0);
		students[1] = new Student("Maria", "Getova", 4.4);
		students[2] = new Student("Ivailo", "Petrov", 3.7);
		students[3] = new Student("Ivailo", "Nedelchev", 5.4);
		students[4] = new Student("Svilen", "Valkanov", 4.8);
		students[5] = new Student("Kostadin", "Milev", 4.0);
		students[6] = new Student("Ivo", "Idakiev", 4.1);
		students[7] = new Student("Peter", "Petkov", 4.0);
		students[8] = new Student("Peter", "Petkov", 4.0);
		students[9] = new Student("Peter", "Petkov", 4.0);

		Arrays.sort(students);

		for (Student student : students) {
			System.out.println(student);
		}
	}

}
