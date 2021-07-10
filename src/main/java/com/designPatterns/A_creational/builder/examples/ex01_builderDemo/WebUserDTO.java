package com.designPatterns.A_creational.builder.examples.ex01_builderDemo;

public class WebUserDTO implements  UserDTO{

    private String name;
    private String address;
    private String age;

    //define a constructor, so that we can create object of ref UserDTO
    public WebUserDTO(String name, String address, String age){
        this.name= name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "WebUserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
