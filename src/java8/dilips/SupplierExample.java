package java8.dilips;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class SupplierExample {
public static void main(String[] args) {
	Supplier<Student> studentSupplier=()->{
		return new  Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
	};
	System.out.println(studentSupplier.get());
	
	Supplier<List<Student>> listSupplier=()->StudentDataBase.getAllStudents();
	System.out.println(listSupplier.get());
}
}
