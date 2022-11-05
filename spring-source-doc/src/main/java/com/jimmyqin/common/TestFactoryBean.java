package com.jimmyqin.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 实际上会注册进两个Bean对象，一个是我们的工厂对象，另一是我们生产出来的对象getObject()
 */
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
