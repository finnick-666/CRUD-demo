package com.finnick.demo.services;

import com.finnick.demo.dtos.student.StudentGetDto;
import com.finnick.demo.dtos.student.StudentPostDto;
import com.finnick.demo.dtos.student.StudentPutDto;
import com.finnick.demo.entities.Student;
import com.finnick.demo.mappers.StudentMapper;
import com.finnick.demo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentGetDto create(StudentPostDto studentPostDto) {
        Student studentEntity = studentMapper.toEntity(studentPostDto);
        return studentMapper.fromEntity(studentRepository.save(studentEntity));

    }

    public StudentGetDto modify(UUID studentId, StudentPutDto studentPutDto) {
        Student student = new Student();
        studentMapper.copy(studentPutDto, student);
        student.setId(studentId);
        return studentMapper.fromEntity(studentRepository.save(student));

    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentGetDto findStudentById(UUID id) {
        StudentGetDto studentGetDto = studentMapper.fromEntity(studentRepository.getOne(id));
        return studentGetDto;
    }

    public StudentGetDto findStudentByName(String name) {
        return studentMapper.fromEntity(studentRepository.findByName(name));
    }

    public void delete(UUID id) {
        studentRepository.deleteById(id);
    }
}
