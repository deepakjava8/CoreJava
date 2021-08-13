package java8.dilips;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static Comparator<Integer> comparator=(a,b)->a.compareTo(b);
public static void main(String[] args) {
	BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
	System.out.println(binaryOperator.apply(3, 4));
	
	BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
	System.out.println("MaxBy Result is : "+maxBy.apply(4, 6));
	
	BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
	System.out.println("MinBy Result is : "+minBy.apply(4, 6));
}
}
