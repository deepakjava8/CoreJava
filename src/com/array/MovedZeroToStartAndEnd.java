package com.array;

public class MovedZeroToStartAndEnd {
public static void main(String[] args) {
	 int[] array = {0,1, 2, 0, 1, 0, 3, 0};
	 moveZeroToLast(array);
	 System.out.println("");
	 moveZeroToFirst(array);
    
}

public static void moveZeroToLast(int[] array) {
	 
		int current = 0;

	    for (int i = 0; i < array.length; i++) {   	
	    	if (array[i] != 0) {
	    		array[current++] = array[i];
	    	}
	    }

	    while (current < array.length) {
	    	array[current++] = 0;
	    }
	    
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
}
public static void moveZeroToFirst(int[] array) {
    int current = array.length - 1;
    for (int i = array.length - 1; i >= 0; i--) {
        if (array[i] != 0) {
            array[current--] = array[i];
        }
    }
    while (current >= 0) {
        array[current--] = 0;
    }

    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
