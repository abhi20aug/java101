package com.designPatterns.A_creational.builder.examples.ex01_builderDemo;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {

        User user1 = newUser1();
        UserDTOBuilder builder = new WebUserDTOBuilder();
        UserDTO dto = directBuild(builder,user1);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName())
               .withLastName(user.getLastName())
               .withBirthDay(user.getBirthday())
               .withAddress(user.getAddress())
               .build(); //assemble
    }

    //create a user
    public static User newUser1() {
        User user1 = new User();
        user1.setFirstName("abhishek");
        user1.setLastName("agrawal");
        user1.setBirthday(LocalDate.of(1983, 11, 20));
        Address addr1 = new Address();
        addr1.setHouseNumber("263/921");
        addr1.setStreet("Kumbha Marg");
        addr1.setCity("Jaipur");
        addr1.setState("Rajasthan");
        addr1.setZipcode("302033");
        user1.setAddress(addr1);
        return user1;
    }

}


/*
what I have v/s what I need
    --Input Passed as Primitive
        firstName, LastName, Date Of Birth, HN, Str Addr, City, State, Pin Code
    --OutPut: UserDTO Object
            Out
            String getName(); //fn+Ln
            String getAddress(); // HN, Str Addr, City, State, Pin Code
            String getAge(); // Period Class
            IN
            UserDTO(fn, ln, dob, hn, str .....)
            return Object.



 */