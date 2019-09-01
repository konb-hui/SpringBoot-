package com.zph.springboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*修改HelloController，使得访问/hello一定会产生异常: some exception */
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model m){
		m.addAttribute("name", "thymeleaf");
		return "hello";
	}
	
}
