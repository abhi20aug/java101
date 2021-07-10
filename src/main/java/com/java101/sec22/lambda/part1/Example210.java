package com.java101.sec22.lambda.part1;
//what i need to do
//implement a functional interface.
//what is functuional interface
// interface having 1 method.

//define a interface
interface MyInterface {
    //define a abstract method.
    void display();
}

//to use the interface methods we need to have a class that implements its methods.
//
//class MyClass implements MyInterface{
//    @Override
//    public void display() {
//        System.out.println("display method is implemented inside MyClass");
//    }
//}

//class having main method which can call MyClass
public class Example210 {
    public static void main(String[] args) {

          //method-1
            //        MyClass mc = new MyClass();
            //        mc.display();

          //method-2
            //        MyInterface mc = new MyClass();
            //        mc.display();

          //method-3
//            MyInterface mc = new MyInterface() {
//                public void display() {
//                    System.out.println("implemented as inner class");
//                }
//            };
//            mc.display();

        //method-4
        MyInterface mc = () -> {
                System.out.println("implemented as inner class");
        };
        //since interface has only 1 method
        mc.display();


    }


}
