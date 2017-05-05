package org.light4j.sping4.usually.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context =   new AnnotationConfigApplicationContext();
		  
		  context.getEnvironment().setActiveProfiles("prod"); //①
		  context.register(ProfileConfig.class);//②
		  context.refresh(); //③
		  
	      DemoBean demoBean = context.getBean(DemoBean.class);
	      
	      System.out.println(demoBean.getContent());
	      
	      context.close();
	}
}
