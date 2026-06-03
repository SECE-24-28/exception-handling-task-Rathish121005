package com.eduhub.eduhub_backend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EduhubBackendApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(EduhubBackendApplication.class, args);
		Student s=context.getBean(Student.class);
		s.study();
	}

}
