package com.zph.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//创建 Application.java，其注解 @SpringBootApplication 
//表示这是一个SpringBoot应用，运行其主方法就会启动tomcat,默认端口是8080
@SpringBootApplication
@ServletComponentScan
public class Application extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
