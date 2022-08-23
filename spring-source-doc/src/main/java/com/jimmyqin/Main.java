package com.jimmyqin;

import com.jimmyqin.config.MyConfig;
import com.jimmyqin.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author qinrongjun
 * @email qt365793530@gmail.com
 * @date 2022-08-22 16:49
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyService myService = context.getBean(MyService.class);
		myService.helloService();
	}
}