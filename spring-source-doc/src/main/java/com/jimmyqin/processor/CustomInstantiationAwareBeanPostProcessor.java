package com.jimmyqin.processor;

import com.jimmyqin.common.PostProcessBeforeInstantiationBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		// 每个bean创建都会调用一次这里，使用的时候需根据需求判断，不必要多次执行创建
		// 如果这里返回不为空，则后续的创建bean的流程不用走下去了，因为此时已经生成想要的bean
		if (beanClass.isAssignableFrom(PostProcessBeforeInstantiationBean.class)) {
			return new PostProcessBeforeInstantiationBean("我是后之处理器创建的postProcessBeforeInstantiationBean");

		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}
}
