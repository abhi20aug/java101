package oop.example.interfaces.challenge1;

public class Customer implements  IMember{

    String name;

    public void Customer(String n){
        this.name = n;
    }

    public void callback(){
        System.out.println("OK, I will visit");
    }
}
