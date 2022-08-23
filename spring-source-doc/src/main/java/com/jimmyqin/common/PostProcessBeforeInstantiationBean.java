package com.jimmyqin.common;

import org.springframework.stereotype.Component;

@Component
public class PostProcessBeforeInstantiationBean {
	public String name;

	public PostProcessBeforeInstantiationBean() {
	}

	public PostProcessBeforeInstantiationBean(String name) {
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
		return "postProcessBeforeInstantiationBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
