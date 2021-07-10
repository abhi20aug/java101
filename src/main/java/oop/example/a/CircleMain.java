package oop.example.a;

class Circle {
    //prorperties
    public int radious;

    //methods
    public double getArea(int r){
        return r*r*3.14;
    }
}

class CircleMain{
    public static void main (String args[]){
        int a = 5;
        Circle c = new Circle();
        System.out.println(c.getArea(a));
    }
}