package com.test;

public class Test12 {
public static void main(String[] args) {
	System.out.println(2^8);
	int[] array = {4, 3, 7, 5, 1, 3, 5, 3, 1, 3, 4};
	 int result = getOddCountElement(array);
	 System.out.println(result);
}

private static int getOddCountElement(int[] array) {
	int xorResult=0;
	for(int i=0;i<array.length;i++) {
		xorResult=xorResult^array[i];
	}
	return xorResult;
}

}
