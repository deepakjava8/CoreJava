package java8.dilips;

import java.util.function.Consumer;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	static Consumer<Student> c1=p->System.out.println(p);
	static Consumer<Student> c2=System.out::println;
	
	static Consumer<Student> c3=Student::printActivities;
public static void main(String[] args) {
	StudentDataBase.getAllStudents().forEach(c2);
	StudentDataBase.getAllStudents().forEach(c3);
}
}
