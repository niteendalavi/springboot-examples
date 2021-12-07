package com.example.samples;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(value="com.example.*")
@SpringBootApplication
public class HelloUserApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(
	      SpringApplicationBuilder builder) {
	        return builder.sources(HelloUserApplication.class);
	    }
}
