package com.example.demo.controller;

import javax.validation.*;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    com.example.demo.service.EmployeeService service;

    com.example.demo.entity.mapper.EmployeeMapper mapper = com.example.demo.entity.mapper.EmployeeMapper.INSTANCE;

    @GetMapping("/dprts")
    public java.util.List<com.example.demo.entity.Department> getDprts()  {
        return service.getDprts();
    }

    @GetMapping("/employee/{id}")
    public com.example.demo.entity.dto.EmployeeDto getEmployee(@PathVariable("id") java.lang.Long id)  {
        return mapper.toDto(service.getEmployee(id));
    }

    @GetMapping("/employees")
    public java.util.List<com.example.demo.entity.dto.EmployeeDto> getEmployees()  {
        return service.getEmployees().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/department")
    public com.example.demo.entity.Department addDepartment(@Valid @RequestBody com.example.demo.entity.Department department)  {
        return service.addDepartment(department);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartment(@PathVariable("id") java.lang.Long id)  {
        service.deleteDepartment(id);
    }

}
