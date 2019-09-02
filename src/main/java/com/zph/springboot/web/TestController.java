package com.zph.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zph.springboot.pojo.Product;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String test(Model m) {
		String htmlContent = "<p style='color:red'>红色文字</p>";
		Product currentProduct = new Product(5, "product e", 200);
		boolean testBoolean = false;
		
		m.addAttribute("htmlContent", htmlContent);
		m.addAttribute("currentProduct",currentProduct);
		m.addAttribute("testBoolean", testBoolean);
		
		return "test";
	}
	
}
