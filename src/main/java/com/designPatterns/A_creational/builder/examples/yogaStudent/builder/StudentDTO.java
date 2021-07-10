package com.designPatterns.A_creational.builder.examples.yogaStudent.builder;

public class StudentDTO {

    public String getStudentName;
    public String getCommChannel;
    public String getYogaDetails;

    public String getGetStudentName() {
        return getStudentName;
    }

    public String getGetCommChannel() {
        return getCommChannel;
    }

    public String getGetYogaDetails() {
        return getYogaDetails;
    }

    public StudentDTO(String getStudentName, String getCommChannel, String getYogaDetails) {
        this.getStudentName = getStudentName;
        this.getCommChannel = getCommChannel;
        this.getYogaDetails = getYogaDetails;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "getStudentName='" + getStudentName + '\'' +
                ", getCommChannel='" + getCommChannel + '\'' +
                ", getYogaDetails='" + getYogaDetails + '\'' +
                '}';
    }
}
