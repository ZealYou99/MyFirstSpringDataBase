package com.example.myfirstspringdatabase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MyFirstSpringDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringDatabaseApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {

		};
	};
}
