package com.example.demo.entity.mapper;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Lesson;
import com.example.demo.entity.dto.EmployeeDto;
import com.example.demo.entity.dto.LessonDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-13T21:37:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    private final LessonMapper lessonMapper = Mappers.getMapper( LessonMapper.class );

    @Override
    public EmployeeDto toDto(Employee e) {
        if ( e == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setDprtId( eDepartmentId( e ) );
        employeeDto.setLessonSummary( lessonListToLessonDtoList( e.getLessons() ) );
        employeeDto.setId( e.getId() );
        employeeDto.setName( e.getName() );

        return employeeDto;
    }

    @Override
    public Employee toEnity(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setDepartment( employeeDtoToDepartment( dto ) );
        employee.setLessons( lessonDtoListToLessonList( dto.getLessonSummary() ) );
        employee.setId( dto.getId() );
        employee.setName( dto.getName() );

        return employee;
    }

    private Long eDepartmentId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Department department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<LessonDto> lessonListToLessonDtoList(List<Lesson> list) {
        if ( list == null ) {
            return null;
        }

        List<LessonDto> list1 = new ArrayList<LessonDto>( list.size() );
        for ( Lesson lesson : list ) {
            list1.add( lessonMapper.toDto( lesson ) );
        }

        return list1;
    }

    protected Department employeeDtoToDepartment(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( employeeDto.getDprtId() );

        return department;
    }

    protected List<Lesson> lessonDtoListToLessonList(List<LessonDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Lesson> list1 = new ArrayList<Lesson>( list.size() );
        for ( LessonDto lessonDto : list ) {
            list1.add( lessonMapper.toEnity( lessonDto ) );
        }

        return list1;
    }
}
