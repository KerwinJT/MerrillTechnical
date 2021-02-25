package com.kerwin.technical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@RestController
@SpringBootApplication
@Configuration
public class MerrillTechnicalApplication {

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())            
          .paths(PathSelectors.any())                          
          .build();                                           
    }

	public static void main(String[] args) {
		SpringApplication.run(MerrillTechnicalApplication.class, args);
	}

	@GetMapping("/noauth/")
	public String noAuthReturn() {
		return "NoAuth Available";
	}

}
