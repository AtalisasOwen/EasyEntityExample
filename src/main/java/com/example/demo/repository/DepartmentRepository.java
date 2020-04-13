package com.example.demo.repository;

public interface DepartmentRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.demo.entity.Department, java.lang.Long>, org.springframework.data.jpa.repository.JpaSpecificationExecutor<com.example.demo.entity.Department> {}
