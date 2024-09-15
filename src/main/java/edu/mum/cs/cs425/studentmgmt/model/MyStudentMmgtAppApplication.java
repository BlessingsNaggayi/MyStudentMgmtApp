package edu.mum.cs.cs425.studentmgmt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMmgtAppApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMmgtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Student student = new Student(,000-61-0001,"Anna","Lynn","Smith",3.45, LocalDate.of(2019, 5, 24));

		//saveStudent(student);
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
		System.out.println("Student saved: " + student);
	}
}
