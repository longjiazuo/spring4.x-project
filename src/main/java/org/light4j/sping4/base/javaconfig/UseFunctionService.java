package org.light4j.sping4.base.javaconfig;

//①
public class UseFunctionService {
	//②
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}
}
