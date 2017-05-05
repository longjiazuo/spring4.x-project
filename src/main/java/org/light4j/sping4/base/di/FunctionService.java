package org.light4j.sping4.base.di;

import org.springframework.stereotype.Service;

@Service //1
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}

}
