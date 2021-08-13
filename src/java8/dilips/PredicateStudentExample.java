package java8.dilips;

import java.util.List;
import java.util.function.Predicate;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1=s->s.getGradeLevel()>=3;
	static Predicate<Student> p2=s->s.getGpa()>=3.9;
	
	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void filterStudentByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if(p2.test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student->{
			if(p2.and(p2).negate().test(student)) {
				System.out.println(student);
			}
		});
	}
public static void main(String[] args) {
	//filterStudentByGradeLevel();
	//filterStudentByGpa();
	filterStudents();
}
}
