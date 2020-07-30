package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	/**
	 * 1）main方法所在的类，该类后续将被作为主要的资源来使用，比如通过该类获取到basePackage；
	 * 2）main方法的命令行参数，命令行参数可以通过main传入，也就意味着可以在springboot启动的时候设置对应的参数，比如当前是dev环境、还是production环境等。
	 */
	public static void main(String[] args) {
		// run方法将调用另外一个内部run方法，并返回一个ConfigurableApplicationContext
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
