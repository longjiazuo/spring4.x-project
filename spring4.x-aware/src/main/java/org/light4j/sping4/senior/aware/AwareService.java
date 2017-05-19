package org.light4j.sping4.senior.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{//①
	
	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {//②
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {//③
		this.beanName = name;
	}
	
	public void outputResult(){
		System.out.println("Bean的名称为：" + beanName);
		
		Resource resource = loader.getResource("classpath:org/light4j/sping4/senior/aware/test.txt");
		try{
			
			System.out.println("ResourceLoader加载的文件内容为: " + IOUtils.toString(resource.getInputStream()));
			
		   }catch(IOException e){
			e.printStackTrace();
		   }
	}
}
