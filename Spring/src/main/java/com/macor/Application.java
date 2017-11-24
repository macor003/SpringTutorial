package com.macor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.macor.Config.SpringConfiguration;
import com.macor.Intarfaces.HelloService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(":: " + beanName);
		}

		HelloService saluda = ctx.getBean("saludaServiceJava", HelloService.class);
		saluda.saludar();

		ctx.close();
	}
}
