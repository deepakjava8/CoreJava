package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Test6 {
public static void main(String[] args) throws Exception{
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please Enter the input");
	int input=Integer.parseInt(br.readLine());
	System.out.println("User Input : "+input);*/
	
	Runtime runTime=Runtime.getRuntime();
	String[] str= {"C:\\Users\\deepak_goswami\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe","https://www.javatpoint.com/"};
	Process exec = runTime.exec(str);
	Thread.sleep(1000);
	exec.destroy();
	System.out.println("done");
}
}
