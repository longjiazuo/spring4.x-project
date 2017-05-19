package org.light4j.sping4.base.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class); //①
		 
		 UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //②
		 
		 System.out.println(useFunctionService.SayHello("world"));
		 
		 context.close();
	}
}
