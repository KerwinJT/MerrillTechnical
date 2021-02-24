package com.kerwin.technical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/api")
public class MerrillTechnicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerrillTechnicalApplication.class, args);
	}
	
	@GetMapping("/noauth/")
	public String noAuthReturn() {
		return "NoAuth Available";
	}

}
