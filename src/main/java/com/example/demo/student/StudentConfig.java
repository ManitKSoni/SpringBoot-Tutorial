package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student manit = new Student(
                "Manit",
                "manit.soni@gmail.com",
                21,
                LocalDate.of(2000, Month.JUNE, 16)
            );

            Student alex = new Student(
                "Alex",
                "alex@gmail.com",
                21,
                LocalDate.of(2000, Month.AUGUST, 26)
            );

            repository.saveAll(
                List.of(manit, alex)
            );
        };
    }
}
