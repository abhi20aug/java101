package com.designPatterns.A_creational.builder.examples.ex01_builderDemo;

import java.time.LocalDate;
import java.time.Period;

public class WebUserDTOBuilder implements UserDTOBuilder{

    String fName;
    String lName;
    String age;
    String address;
    private WebUserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fName) {
        this.fName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        this.lName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYr = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYr.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() +", "
                       +address.getStreet() +" ,"
                       +address.getCity() +" ,"
                       +address.getState() +" ,"
                       +address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new WebUserDTO(fName +" "+lName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
