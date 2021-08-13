package java8.dilips;

import java.util.List;
import java.util.function.Consumer;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class ConsumerExample {
	static List<Student> studentList = StudentDataBase.getAllStudents();
	static Consumer<Student> c2=student->System.out.println(student);
	static Consumer<Student> c3=student->System.out.print(student.getName());
	static Consumer<Student> c4=student->System.out.println(student.getActivities());
	
	public static void printName() {
		studentList.forEach(c2);
	}
	
	public static void printNameAndActivies() {
		studentList.forEach(c3.andThen(c4));
	}
	
	public static void pirntNameAndActivitiesUsingCondition() {
		studentList.forEach(student->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				c3.andThen(c4).accept(student);
			}
		});
	}
	
public static void main(String[] args) {
	//printName();
//	printNameAndActivies();
	pirntNameAndActivitiesUsingCondition();
}
}
