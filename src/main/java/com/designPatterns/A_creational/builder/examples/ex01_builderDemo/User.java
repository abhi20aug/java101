package com.designPatterns.A_creational.builder.examples.ex01_builderDemo;

import java.time.LocalDate;

public class User {

    //user has 4 attributes
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

//create getters and setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
