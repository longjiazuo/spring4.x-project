package org.light4j.sping4.usually.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		 
		 ElConfig resourceService = context.getBean(ElConfig.class);
		 
		 resourceService.outputResource();
		 
		 context.close();
	}

}
