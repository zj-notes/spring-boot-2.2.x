package com.springbootdemo.service.impl;

import com.springbootdemo.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("calculateService")
public class CalculateServiceImpl implements CalculateService {

	/**
	 * ApplicationContext 对象会直接中注入，说明 ApplicationContext 被容器管理
	 * 除此之外还可以通过 构造函数注入
	 */
	// 直接注入
	@Autowired
	private ApplicationContext applicationContext ;

//	// 构造函数注入
//	private ApplicationContext applicationContext2;
//	public CalculateServiceImpl(ApplicationContext applicationContext){
//		System.out.println(applicationContext.getClass());
//		this.applicationContext2=applicationContext;
//	}

	private String serviceDesc = "desc from class";

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public String getServiceDesc() {
		return serviceDesc;
	}

	@Override
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	@Override
	public String applicationContextTest(){
		System.out.println(applicationContext.toString());
		return applicationContext.toString();
	}
}