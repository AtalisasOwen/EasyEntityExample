package com.example.demo.entity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(imports = {})
public interface LessonMapper {
    LessonMapper INSTANCE = Mappers.getMapper( LessonMapper.class );

    @Mapping(source = "department.id", target = "dprtId")
    com.example.demo.entity.dto.LessonDto toDto(com.example.demo.entity.Lesson e);

    @InheritInverseConfiguration
    com.example.demo.entity.Lesson toEnity(com.example.demo.entity.dto.LessonDto dto);
}
