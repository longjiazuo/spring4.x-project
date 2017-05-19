package org.light4j.sping4.usually.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	@PostConstruct //①
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy //②
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
