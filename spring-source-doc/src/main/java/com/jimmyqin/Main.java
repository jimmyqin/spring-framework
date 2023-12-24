package com.jimmyqin;

import com.jimmyqin.common.PostProcessBeforeInstantiationBean;
import com.jimmyqin.common.TestFactoryBean;
import com.jimmyqin.common.TestFactoryBeanCopy;
import com.jimmyqin.config.MyConfig;
import com.jimmyqin.service.IMyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author qinrongjun
 * @email qt365793530@gmail.com
 * @date 2022-08-22 16:49
 */
public class Main {
	public static void main(String[] args) {
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		IMyService myService = context.getBean(IMyService.class);
		TestFactoryBeanCopy factoryBeanCopy = (TestFactoryBeanCopy)context.getBean("testFactoryBean");
		TestFactoryBean factoryBeanCopy1 = (TestFactoryBean)context.getBean("&testFactoryBean");
		PostProcessBeforeInstantiationBean m = context.getBean(PostProcessBeforeInstantiationBean.class);
		myService.helloService();
		System.out.println(m);
		System.out.println(factoryBeanCopy);
		context.close();
	}
}