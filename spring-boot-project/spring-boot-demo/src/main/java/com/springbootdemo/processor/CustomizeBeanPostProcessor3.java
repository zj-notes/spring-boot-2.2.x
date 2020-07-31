package com.springbootdemo.processor;


import com.springbootdemo.service.CalculateService;
import com.springbootdemo.util.Utils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class CustomizeBeanPostProcessor3 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("*************** CustomizeBeanPostProcessor3 before ********************");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		return bean;
	}
}