package com.finnick.demo.dtos.student;

import lombok.Data;

import java.util.UUID;

@Data
public class StudentGetDto {
    private UUID id;
    private String name;

}
