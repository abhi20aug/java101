package oop.example.inner.local;

//define a new class inside a method
//used when there is a unique req to extend a class, or implement an interface.

public class Outer {
    int x=10;
    //method
    void outerDisplay(){

        System.out.println("outerDisplay method Starts***");
        System.out.println("outerDisplay x: "+x);

        class Inner{
            int y =20;
            void innerDisplay(){
                System.out.println("innerDisplay method Starts***");
                System.out.println("innerDisplay y: "+y);
                System.out.println("innerDisplay x: "+x);
                System.out.println("innerDisplay method Ends***");
            }
        }

        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("outerDisplay i.y"+i.y);
        System.out.println("outerDisplay method Ends***");
    }
}
