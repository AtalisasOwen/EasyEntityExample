package com.example.demo.entity.dto;

public class LessonDto {
    private java.lang.Long id;
    private java.lang.String name;
    private java.lang.Long dprtId;

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

    public String toString() {
    return "LessonDto{" +
                "id=" + id +
                ", name=" + name +
                ", dprtId=" + dprtId +
                '}';
    }

}