package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args); // This applicatiooncontext used for object creation in IOC container
		Dev obj = context.getBean(Dev.class); // in this wr'e not use new keyword instead of this get bean from context and use it
		obj.build();
	}

}
