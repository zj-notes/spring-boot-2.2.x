package com.springbootdemo.processor;


import com.springbootdemo.service.CalculateService;
import com.springbootdemo.util.Utils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomizeBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("*************** CustomizeBeanPostProcessor before ********************");

		if("calculateService".equals(beanName)) {
			Utils.printTrack("do postProcess before initialization");
			CalculateService calculateService = (CalculateService)bean;
			calculateService.setServiceDesc("desc from " + this.getClass().getSimpleName());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("calculateService".equals(beanName)) {
			Utils.printTrack("do postProcess after initialization");
		}
		return bean;
	}
}