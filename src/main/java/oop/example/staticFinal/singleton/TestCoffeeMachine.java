package oop.example.staticFinal.singleton;

public class TestCoffeeMachine {

    public static void main(String[] args) {

        //sample for public constructor
        //        CoffeeMachine c1 = new CoffeeMachine();
        //        CoffeeMachine c2 = new CoffeeMachine();
        //        CoffeeMachine c3 = new CoffeeMachine();
        //
        //        //all making new objects of coffemachine class.
        //        System.out.println(c1);
        //        System.out.println(c2);
        //        System.out.println(c3);

        //we want to restrict way of creating instances.
        //private constructor will not allow to create instances.

        CoffeeMachine c4 =  CoffeeMachine.getCoffee();
        CoffeeMachine c5 =  CoffeeMachine.getCoffee();
        CoffeeMachine c6 =  CoffeeMachine.getCoffee();
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        //private constructor will not allow to create instances.
        System.out.println("Prepare 4 coffees***************");
        CoffeeMachine c11 =  CoffeeMachine.get4Coffee();
        CoffeeMachine c12 =  CoffeeMachine.get4Coffee();
        CoffeeMachine c13 =  CoffeeMachine.get4Coffee();
        CoffeeMachine c14 =  CoffeeMachine.get4Coffee();
        CoffeeMachine c15 =  CoffeeMachine.get4Coffee();
        CoffeeMachine c16 =  CoffeeMachine.get4Coffee();

        System.out.println(c11);
        System.out.println(c12);
        System.out.println(c13);
        System.out.println(c14);
        System.out.println(c15);
        System.out.println(c16);
    }
}
