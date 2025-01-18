package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Test1Application.class, args);
	  OfficeSystem system =context.getBean(OfficeSystem.class);
	  system.printDocument("abcd");
	  
	}

}
