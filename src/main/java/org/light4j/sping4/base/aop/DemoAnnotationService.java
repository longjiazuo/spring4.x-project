package org.light4j.sping4.base.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的add操作")
    public void add(){} 
}
