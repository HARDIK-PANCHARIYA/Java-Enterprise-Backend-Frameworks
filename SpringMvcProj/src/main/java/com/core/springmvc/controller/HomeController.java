package com.core.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.springmvc.model.User;

@Controller
public class HomeController {
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("I am  in Home controller");
		return "Hello Home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
//	@PostMapping("/processdata")
//	public String success(@RequestParam String uname, @RequestParam String password, @RequestParam String email) {
//		System.out.println("User Name :- "+uname);
//		System.out.println("Password :- "+password);
//		System.out.println("Email :- "+email);
//		return "success";
//	}
	
//	@PostMapping("/processdata")
//	public String success(@RequestParam String uname, @RequestParam String password, @RequestParam String email,Model m) {
//		System.out.println("User Name :- "+uname);
//		System.out.println("Password :- "+password);
//		System.out.println("Email :- "+email);
//		
//		m.addAttribute("u",uname);
//		m.addAttribute("p", password);
//		m.addAttribute("e", email);
//		return "success";
//	}
	
	@PostMapping("/processdata")
	public String success(@ModelAttribute User u) {
		
		return "success";
	}

}
