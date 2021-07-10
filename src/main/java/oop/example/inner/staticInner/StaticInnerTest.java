package oop.example.inner.staticInner;

public class StaticInnerTest {

    public static void main(String[] args) {

        Outer.StaticInner osi = new Outer.StaticInner();
        osi.staticDisplay();
        System.out.println(Outer.StaticInner.staticDisplay());
    }
}
