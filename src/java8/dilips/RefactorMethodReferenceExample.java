package java8.dilips;

import java.util.function.Predicate;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	static Predicate<Student> p1=s->s.getGradeLevel()>=3;
public static void main(String[] args) {
	System.out.println(StudentDataBase.studentSupplier.get());
}
}
