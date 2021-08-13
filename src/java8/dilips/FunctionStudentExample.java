package java8.dilips;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class FunctionStudentExample {
	 static Function<List<Student>, Map<String, Double>> studentFunction=(students->{
		 Map<String, Double> studentGradeMap=new HashMap<>();
		 students.forEach(student->{
			 if(PredicateStudentExample.p1.test(student)) {
				 studentGradeMap.put(student.getName(), student.getGpa());
			 }
		 });
		 return studentGradeMap;
	 });
public static void main(String[] args) {
	System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
}
}
