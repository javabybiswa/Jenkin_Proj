package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	 @GetMapping("/java")
	 public String getData() {
		 
		 return "Spring boot application Running with Docker on EC2 Service of AWS...";
	 }
}
