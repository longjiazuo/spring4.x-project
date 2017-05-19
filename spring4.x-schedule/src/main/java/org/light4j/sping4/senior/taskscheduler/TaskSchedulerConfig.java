package org.light4j.sping4.senior.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("org.light4j.sping4.senior.taskscheduler")
@EnableScheduling //①
public class TaskSchedulerConfig {

}
