package com.unitTest.junit;



public class Ex04Circle {

    private final int radius;
    private final double PI = 3.14;

    public Ex04Circle(int radius) {

        if ( radius <= 0 && radius > 100){
            throw new RuntimeException("Radius range is 0 to 100");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getDiameter() {
        return this.radius*2;
    }

    public double getCircumference() {
        return this.radius*PI*2;
    }

    public double getArea() {
        return PI*(this.radius)*(this.radius);
    }
}
