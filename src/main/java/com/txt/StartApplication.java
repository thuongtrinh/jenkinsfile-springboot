package com.txt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title", "Jenkinsfile + Docker + Spring Boot");
		model.addAttribute("msg", "Welcome to the Jenkinsfile and docker container!");
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
