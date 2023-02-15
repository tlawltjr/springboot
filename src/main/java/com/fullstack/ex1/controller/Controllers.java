package com.fullstack.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class Controllers {
	
	@GetMapping("/ex1")
	public void ex1() {
		System.out.println("/ex1 요청 수행함");
	}
}
