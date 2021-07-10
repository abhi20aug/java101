package oop.example.abstractExamples.shapes;

public class testCircle {
    public static void main(String[] args) {

        ShapeAbstract c = new Circle(3);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }

}
