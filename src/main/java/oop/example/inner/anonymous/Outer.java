package oop.example.inner.anonymous;

public class Outer {
    int x = 10;

    void outerDisplay(){
        System.out.println("outerDisplay Starts");

        My mc = new My(){
            int y = 20;
            void display()
            {
                System.out.println("abstract class My display method implement Starts");
                System.out.println(" y: "+y);
                System.out.println(" x: "+x);
                System.out.println("abstract class My display method implement Starts");
            }
        };

        mc.display();

        System.out.println("****************");
        IMy mi = new IMy(){
            int y = 30;
            public void display()
            {
                System.out.println("abstract Interface IMy display method implement Starts");
                System.out.println(" y: "+y);
                System.out.println(" x: "+x);
                System.out.println("abstract interface IMy display method implement Starts");
            }
        };

        mi.display();
        System.out.println("****************");
        System.out.println(" outer x: "+x);
        System.out.println("outerDisplay Ends");

    }



}
