package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ChalsigautamApplication {
	
	@GetMapping("name")
	public String displayName() {
		return "Myself chalsi :)";
	}
	public static void main(String[] args) {
		SpringApplication.run(ChalsigautamApplication.class, args);
	}

}
