package com.example.SpringBootDemoProject;

import com.example.SpringBootDemoProject.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootDemoProjectApplication.class, args);
		Student student=context.getBean(Student.class);
		student.study();
	}

}
