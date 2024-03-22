package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> GetStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "Mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,	23),
                        21

                )
        );
    }
}
