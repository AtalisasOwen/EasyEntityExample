package com.example.demo.entity;

import com.atalisas.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Dto
@Data
@AllArgsConstructor
@NoArgsConstructor
@AutoRepository
@Entity
public class Employee {
    @Id
    Long id;
    String name;
    @DtoField(value = "id", rename = "dprtId")
    @OneToOne
    Department department;
    @DtoEntityField(rename = "lessonSummary")
    @OneToMany
    List<Lesson> lessons;
}
