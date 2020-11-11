package com.finnick.demo.Controllers;

import com.finnick.demo.dtos.student.StudentGetDto;
import com.finnick.demo.dtos.student.StudentPostDto;
import com.finnick.demo.dtos.student.StudentPutDto;
import com.finnick.demo.entities.Student;
import com.finnick.demo.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public  ResponseEntity<StudentGetDto> add(@RequestBody StudentPostDto studentPostDto) {
        StudentGetDto studentGetDto = studentService.create(studentPostDto);
        return ResponseEntity.ok(studentGetDto);
    }

    @GetMapping
    public ResponseEntity<List<Student>> find(){
        List<Student> list = studentService.getAllStudents();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentGetDto> findById(@PathVariable UUID studentId) {
        return ResponseEntity.ok(studentService.findStudentById(studentId));
    }

    @GetMapping("search")
    public ResponseEntity<StudentGetDto> findByName(@RequestParam String studentName) {
        return ResponseEntity.ok(studentService.findStudentByName(studentName));
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<StudentGetDto> update(@PathVariable UUID studentId, @RequestBody StudentPutDto studentPutDto) {
        return ResponseEntity.ok(studentService.modify(studentId,studentPutDto));
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity delete(@PathVariable UUID studentId) {
        studentService.delete(studentId);
        return ResponseEntity.ok().build();
    }
}
