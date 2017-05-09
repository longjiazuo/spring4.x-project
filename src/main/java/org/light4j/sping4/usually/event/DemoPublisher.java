package org.light4j.sping4.usually.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext applicationContext;//①
	
	public void publish(String msg){
		applicationContext.publishEvent(new DemoEvent(this, msg));//②
	}

}
