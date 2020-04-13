package com.example.demo.service;

import com.atalisas.annotation.AutoController;
import com.atalisas.annotation.AutoRepository;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AutoController(Employee.class)
public class EmployeeService {

    @Autowired
    com.example.demo.repository.EmployeeRepository repository;
    @Autowired
    com.example.demo.repository.DepartmentRepository departmentRepository;

    public static List<Department> dprts = new ArrayList<>();
    public static List<Lesson> lessons = new ArrayList<>();
    public static List<Employee> employees = new ArrayList<>();

    @PostConstruct
    private void init(){
        Department dprt1 = new Department(1L, "部门1");
        Department dprt2 = new Department(2L, "部门2");
        Department dprt3 = new Department(3L, "部门3");
        dprts.add(dprt1);
        dprts.add(dprt2);
        dprts.add(dprt3);

        Lesson lesson1 = new Lesson(1L, "课程1", dprt1, "XXXXXXx");
        Lesson lesson2 = new Lesson(2L, "课程1", dprt2, "OIAACa");
        Lesson lesson3 = new Lesson(3L, "课程1", dprt3, "ascaXXx");
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);

        Employee employee1 = new Employee(1L, "员工1", dprt1, lessons);
        Employee employee2 = new Employee(2L, "远攻2", dprt2, lessons);
        Employee employee3 = new Employee(3L, "Cassie3", dprt3, lessons);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

    }

    public List<Department> getDprts(){
        return dprts;
    }

    public Employee getEmployee(Long id){
        return employees.stream().filter(e -> e.getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long id){
    }
}
