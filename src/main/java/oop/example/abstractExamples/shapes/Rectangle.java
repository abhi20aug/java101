package oop.example.abstractExamples.shapes;

public class Rectangle extends ShapeAbstract{

    double l;
    double b;

    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }

    public double getArea(){
        return this.l*this.b;
    }

    public double getPerimeter(){
        return 2*this.l*this.b;
    }
}
