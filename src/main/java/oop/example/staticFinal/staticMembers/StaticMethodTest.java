package oop.example.staticFinal.staticMembers;

public class StaticMethodTest {

    public static void main(String[] args) {

        StaticMethod smo  = new StaticMethod();
        smo.sm =20;
        System.out.println("smo.sm: "+smo.sm);

        smo.SetSM();
        System.out.println("smo.sm: "+smo.sm);

        StaticMethod.displaySM(10);

    }
}
