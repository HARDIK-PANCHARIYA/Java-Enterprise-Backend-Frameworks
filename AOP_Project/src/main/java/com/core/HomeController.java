package com.core;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getmsg1() {
		System.out.println("First method run");
		return "Hello Welcome to my AOP project";
	}
	
	@GetMapping("/msg")
	public String getmsg2() {
		System.out.println("method msg 2 run");
		return "Good Morning";
	}
	

}
