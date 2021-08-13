package java8.dilips;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> p1=v->v%2==0;
	static Predicate<Integer> p2=v->v%5==0;
	public static void predicateAnd() {
		System.out.println(p1.and(p2).test(11));// predicate chaining
	}
	public static void predicateOr() {
		System.out.println(p1.or(p2).test(12));// predicate chaining
	}
	public static void predicateNegate() {
		System.out.println(p1.or(p2).negate().test(12));// predicate chaining
	}
public static void main(String[] args) {
	/*System.out.println(p1.test(5));
	System.out.println(p1.test(6));
	predicateAnd();*/
//	predicateOr();
	predicateNegate();
	
}
}
