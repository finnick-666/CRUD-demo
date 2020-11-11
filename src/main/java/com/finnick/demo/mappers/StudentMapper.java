package com.finnick.demo.mappers;


import com.finnick.demo.dtos.student.StudentGetDto;
import com.finnick.demo.dtos.student.StudentPostDto;
import com.finnick.demo.dtos.student.StudentPutDto;
import com.finnick.demo.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {
    Student toEntity(StudentPostDto studentPostDto);
    StudentGetDto fromEntity(Student student);
    void copy(StudentPutDto studentPutDto, @MappingTarget Student student);
}
