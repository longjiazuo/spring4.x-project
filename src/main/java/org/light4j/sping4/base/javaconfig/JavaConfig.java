package org.light4j.sping4.base.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //①
public class JavaConfig {
	@Bean //②
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean 
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService()); //③
		return useFunctionService;
		
	}

//	@Bean 
//	public UseFunctionService useFunctionService(FunctionService functionService){//④
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
}
