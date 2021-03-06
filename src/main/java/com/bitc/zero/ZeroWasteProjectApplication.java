package com.bitc.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude= {MultipartAutoConfiguration.class})
public class ZeroWasteProjectApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ZeroWasteProjectApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZeroWasteProjectApplication.class);
	}
}
