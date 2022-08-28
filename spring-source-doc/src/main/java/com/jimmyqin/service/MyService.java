package com.jimmyqin.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author qinrongjun
 * @email qt365793530@gmail.com
 * @date 2022/8/22 16:47
 */
@Component
public class MyService implements IMyService{
	private String name;

	@Override
	public void helloService() {
		System.out.println("hello service!!!" + name);
	}

	public String getName() {
		return name;
	}

	public MyService setName(String name) {
		this.name = name;
		return this;
	}
}
