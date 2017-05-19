package org.light4j.sping4.usually.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.light4j.sping4.usually.prepost")
public class PrePostConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	// ①
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}