package java8.dilips;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java8.dilips.data.Student;
import java8.dilips.data.StudentDataBase;

public class BiConsumerExample {
	
	public static void nameAndActivities() {
		List<Student> studentList=StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer=(name,activities)->System.out.println(name+activities);
		studentList.forEach(stud->biConsumer.accept(stud.getName(), stud.getActivities()));
	}
public static void main(String[] args) {
	Consumer<String> c1=a->System.out.println(a);
	c1.accept("test000");
	
	BiConsumer<String, String> bc1=(a,b)->{
		System.out.println("A : "+a+" B : "+b);
	};
	bc1.accept("deepak", "kumar");
	
	BiConsumer<Integer, Integer> multiply=(a,b)->{
		System.out.println("Multiply : "+a*b);
	};
	
	BiConsumer<Integer, Integer> division=(a,b)->{
		System.out.println("Division : "+a/b);
	};
	
	multiply.andThen(division).accept(10, 5);
	nameAndActivities();
}
}
