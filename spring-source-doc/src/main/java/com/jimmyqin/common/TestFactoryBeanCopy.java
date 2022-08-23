package com.jimmyqin.common;

public class TestFactoryBeanCopy {
	private String name;

	public TestFactoryBeanCopy() {
	}

	public TestFactoryBeanCopy(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestFactoryBeanCopy{" +
				"name='" + name + '\'' +
				'}';
	}
}
