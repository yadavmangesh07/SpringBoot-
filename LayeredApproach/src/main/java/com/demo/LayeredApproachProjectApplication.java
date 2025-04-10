package com.demo;

import com.demo.model.Student;
import com.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LayeredApproachProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LayeredApproachProjectApplication.class, args);

		Student student=context.getBean(Student.class);
		student.setName("Mangesh");
		student.setAge(21);
		student.setRoll_no(138);

		StudentService studentService=context.getBean(StudentService.class);


		studentService.addStudent(student);
		List<Student> ls=studentService.getStudents();
		System.out.println(ls);
	}

}
