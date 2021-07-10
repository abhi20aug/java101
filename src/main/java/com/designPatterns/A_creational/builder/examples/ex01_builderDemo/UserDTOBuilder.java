package com.designPatterns.A_creational.builder.examples.ex01_builderDemo;

import java.time.LocalDate;

public interface UserDTOBuilder {

    //we need to build parts here based on inputs
    UserDTOBuilder withFirstName(String fName);
    UserDTOBuilder withLastName(String lName);
    UserDTOBuilder withBirthDay(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //method to assemble
    UserDTO build();

    //method to fetch already built object
    UserDTO getUserDTO();

}
