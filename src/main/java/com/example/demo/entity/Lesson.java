package com.example.demo.entity;

import com.atalisas.annotation.Dto;
import com.atalisas.annotation.DtoField;
import com.atalisas.annotation.DtoIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Dto
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lesson {
    @Id
    Long id;
    String name;
    @DtoField(value = "id", rename = "dprtId")
    @OneToOne
    Department department;
    @DtoIgnore
    String ignore;
}
