package org.light4j.sping4.usually.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("org.light4j.sping4.usually.el")
@PropertySource("classpath:org/light4j/sping4/usually/el/test.properties")//⑦
public class ElConfig {
	
	@Value("I Love You!") //①
    private String normal;

	@Value("#{systemProperties['os.name']}") //②
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }") //③
    private double randomNumber;

	@Value("#{demoService.another}") //④
	private String fromAnother;

	@Value("classpath:org/light4j/sping4/usually/el/test.txt") //⑤
	private Resource testFile;

	@Value("http://www.baidu.com") //⑥
	private Resource testUrl;

	@Value("${book.name}") //⑦
	private String bookName;

	@Autowired
	private Environment environment; //⑦
	
	@Bean //7
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}