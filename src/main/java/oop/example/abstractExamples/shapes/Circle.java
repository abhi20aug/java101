package oop.example.abstractExamples.shapes;

public class Circle extends  ShapeAbstract{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
