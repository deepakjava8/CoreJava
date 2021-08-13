package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Vaccinated{
}

class USEmbassy{
	
	@Vaccinated
	public void visaApplication() {
		System.out.println("Visa Granted...");
	}
	
	public void getMeVisa() throws NoSuchMethodException, SecurityException {
		Class<? extends USEmbassy> cls = this.getClass();
		Method method = cls.getMethod("visaApplication");
		if(method.isAnnotationPresent(Vaccinated.class)) {
			visaApplication();
		}else {
			System.out.println("Your Visa is rejected... Please Go and get Vaccinated");
		}
	}
}
public class USClient {
public static void main(String[] args) {
	USEmbassy um=new USEmbassy();
	try {
		um.getMeVisa();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
