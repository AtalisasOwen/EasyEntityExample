package com.example.demo.entity.dto;

public class EmployeeDto {
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.Long dprtId;
    private java.util.List<com.example.demo.entity.dto.LessonDto> lessonSummary;

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setDprtId(java.lang.Long dprtId) {
        this.dprtId = dprtId;
    }

    public java.lang.Long getDprtId() {
        return this.dprtId;
    }

    public void setLessonSummary(java.util.List<com.example.demo.entity.dto.LessonDto> lessonSummary) {
        this.lessonSummary = lessonSummary;
    }

    public java.util.List<com.example.demo.entity.dto.LessonDto> getLessonSummary() {
        return this.lessonSummary;
    }

    public String toString() {
    return "EmployeeDto{" +
                "id=" + id +
                ", name=" + name +
                ", dprtId=" + dprtId +
                ", lessonSummary=" + lessonSummary +
                '}';
    }

}