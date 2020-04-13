package com.example.demo.entity.mapper;

import com.example.demo.entity.Department;
import com.example.demo.entity.Lesson;
import com.example.demo.entity.dto.LessonDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-13T21:37:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
public class LessonMapperImpl implements LessonMapper {

    @Override
    public LessonDto toDto(Lesson e) {
        if ( e == null ) {
            return null;
        }

        LessonDto lessonDto = new LessonDto();

        lessonDto.setDprtId( eDepartmentId( e ) );
        lessonDto.setId( e.getId() );
        lessonDto.setName( e.getName() );

        return lessonDto;
    }

    @Override
    public Lesson toEnity(LessonDto dto) {
        if ( dto == null ) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setDepartment( lessonDtoToDepartment( dto ) );
        lesson.setId( dto.getId() );
        lesson.setName( dto.getName() );

        return lesson;
    }

    private Long eDepartmentId(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }
        Department department = lesson.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Department lessonDtoToDepartment(LessonDto lessonDto) {
        if ( lessonDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( lessonDto.getDprtId() );

        return department;
    }
}
