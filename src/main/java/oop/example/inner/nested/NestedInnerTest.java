package oop.example.inner.nested;

public class NestedInnerTest {

    public static void main(String[] args) {

        //1 way
        Outer oc = new Outer();
        oc.outerDisplay();
        System.out.println("********************");
        //2nd way
        Outer.Inner oic = new Outer().new Inner();
        oic.displayInner();
    }
}
