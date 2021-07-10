package oop.example.inheritance;

class Parent{

    public Parent(){
        System.out.println("Parent np constructor executed");
    }
}

class Child extends  Parent{

    public Child(){
        System.out.println("Child np constructor executed");
    }
}

class grandChild extends Child
{
    public grandChild(){
        System.out.println("grandChild np constructor executed");
    }


}

public class ConstructorsTest {
    public static void main(String[] args) {
        grandChild gc = new grandChild();
    }
}
