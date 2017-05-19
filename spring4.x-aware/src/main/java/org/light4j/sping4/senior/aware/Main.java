package org.light4j.sping4.senior.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		
		context.close();
	}
}
