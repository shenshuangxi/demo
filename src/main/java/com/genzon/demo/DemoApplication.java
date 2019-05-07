package com.genzon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/")
	public ResponseEntity<String> hello() {
		int count = 10;
		for (int i = 0; i < count; i++) {
			System.out.println(i);
		}
		return ResponseEntity.ok("hello demo");
	}

}
