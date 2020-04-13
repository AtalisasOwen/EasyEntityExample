package com.example.demo.repository;

public interface EmployeeRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.demo.entity.Employee, java.lang.Long>, org.springframework.data.jpa.repository.JpaSpecificationExecutor<com.example.demo.entity.Employee> {}
