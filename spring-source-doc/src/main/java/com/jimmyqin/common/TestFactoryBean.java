package com.jimmyqin.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<TestFactoryBeanCopy> {
	private String name;

	public TestFactoryBean() {
	}

	public TestFactoryBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestFactoryBean{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public TestFactoryBeanCopy getObject() throws Exception {
		return new TestFactoryBeanCopy("我是一个TestFactoryBeanCopy");
	}

	@Override
	public Class<?> getObjectType() {
		return TestFactoryBeanCopy.class;
	}
}
