package oop.example.abstractExamples.shapes;

public class testRectangle {

    public static void main(String[] args) {

        ShapeAbstract r = new Rectangle(2,4);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
