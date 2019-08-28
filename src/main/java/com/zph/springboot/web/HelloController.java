package com.zph.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*接着创建控制器类HelloController， 这个类就是Spring MVC里的一个普通的控制器。
@RestController 是spring4里的新注解，是@ResponseBody和@Controller的缩写*/
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}
	
}
