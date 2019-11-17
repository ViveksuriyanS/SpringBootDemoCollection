package io.kathuko.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation denotes that this is a spring boot application
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// Static method, Starts the application and host it
		SpringApplication.run(CourseApiApp.class, args);
	}

}
