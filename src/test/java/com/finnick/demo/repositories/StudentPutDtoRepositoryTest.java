//package com.finnick.demo.repositories;
//
//import com.finnick.demo.DemoApplication;
//import com.finnick.demo.entities.Student;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = DemoApplication.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//public class StudentPutDtoRepositoryTest {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Test
//    public void shouldAddStudentIntoDBSuccessfullyGivenProperStudentObject(){
//        Student student = new Student();
//        student.setName("Finnick");
//        student.setPassword("123");
//        Student returnedStudent = studentRepository.save(student);
//        Assertions.assertEquals("Finnick", returnedStudent.getName());
//        Assertions.assertNotNull(returnedStudent.getPassword());
//    }
//}
