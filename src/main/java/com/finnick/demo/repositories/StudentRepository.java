package com.finnick.demo.repositories;

import com.finnick.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
    Student findByName(String name);
}
