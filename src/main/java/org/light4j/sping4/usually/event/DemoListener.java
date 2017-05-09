package org.light4j.sping4.usually.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//①

	public void onApplicationEvent(DemoEvent event) {//②
		
		String msg = event.getMsg();
		
		System.out.println("我(bean-demoListener)接受到了bean-demoPublisher发布的消息:"+ msg);

	}
}
