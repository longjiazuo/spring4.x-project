package org.light4j.sping4.base.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.light4j.sping4.base.aop")
@EnableAspectJAutoProxy //①
public class AopConfig {

}
