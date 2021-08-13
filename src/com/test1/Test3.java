package com.test1;

public class Test3 {
public static void main(String[] args) {
	checkPalindrome(121);
}
//121
//1
//21
public static void checkPalindrome(int data){
int rem=0;
int reverse=0;
	for(int i=0;i<data;i++){
		rem=data/10;
		reverse=reverse*10+rem;
		//data=rem
		System.out.println(reverse);
		//rem=data;
 		//rem=rem*reverse+
		//reverse=
	  }
	}

}
