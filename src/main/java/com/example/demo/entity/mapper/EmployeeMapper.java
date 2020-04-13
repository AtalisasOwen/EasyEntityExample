package com.example.demo.entity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(imports = {} ,uses = {com.example.demo.entity.mapper.LessonMapper.class})
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class );

    @Mapping(source = "department.id", target = "dprtId")
    @Mapping(source = "lessons", target = "lessonSummary")
    com.example.demo.entity.dto.EmployeeDto toDto(com.example.demo.entity.Employee e);

    @InheritInverseConfiguration
    com.example.demo.entity.Employee toEnity(com.example.demo.entity.dto.EmployeeDto dto);
}
