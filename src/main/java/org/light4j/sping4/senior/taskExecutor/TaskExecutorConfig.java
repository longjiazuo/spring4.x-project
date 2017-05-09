package org.light4j.sping4.senior.taskExecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
@Configuration
@ComponentScan("org.light4j.sping4.senior.taskExecutor")
@EnableAsync //①
public class TaskExecutorConfig implements AsyncConfigurer{//②

	@Override
	public Executor getAsyncExecutor() {//②
		 ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
	        taskExecutor.setCorePoolSize(5);
	        taskExecutor.setMaxPoolSize(10);
	        taskExecutor.setQueueCapacity(25);
	        taskExecutor.initialize();
	        return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
