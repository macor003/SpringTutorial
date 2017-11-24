package com.macor.Impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.macor.Intarfaces.HelloService;

@Service(value = "saludaServiceJava")
public class HelloServiceImpl implements HelloService, InitializingBean, DisposableBean {

	@Override
	public void saludar() {
		System.out.println("\n--- Hello Spring Framework. Great job Mario! ---\n");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("--- run destroy method ---");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("--- run init method ---");

	}
}
