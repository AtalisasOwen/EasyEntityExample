package com.example.demo.entity;

import com.atalisas.annotation.AutoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@AutoRepository
public class Department {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
}
