package com.designPatterns.A_creational.builder.examples.yogaStudent.model;

public class Student {

    private String firstName;
    private String lastName;
    private CommunicationChannel communicationChannel;
    private Yoga yoga;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public CommunicationChannel getCommunicationChannel() {
        return communicationChannel;
    }

    public Yoga getYoga() {
        return yoga;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCommunicationChannel(CommunicationChannel communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public void setYoga(Yoga yoga) {
        this.yoga = yoga;
    }
}
