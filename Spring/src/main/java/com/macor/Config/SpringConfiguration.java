package com.macor.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.macor.Impl.HelloServiceImpl;
import com.macor.Intarfaces.HelloService;

@Configuration
@ComponentScan("com.macor.Impl")
public class SpringConfiguration {

	@Bean(name = "saludaService")
	public HelloService getSaludaService() {
		return new HelloServiceImpl();
	}
}
