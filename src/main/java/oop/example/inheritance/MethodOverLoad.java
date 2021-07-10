package oop.example.inheritance;


class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l, int b){
    this.length = l;
    this.breadth =b;

        System.out.println("rec length"+this.length);
        System.out.println("rec breadth"+this.breadth);
    }

    public int getArea(){
        return this.length*this.breadth;
    }

    public int getPerimeter(){
        return (this.length+this.breadth)*2;
    }

}


class Cuboid extends Rectangle{

    int height;
    int length = 10;
    public Cuboid(int l, int b, int h){
        super(l,b);
        this.height = h;

        System.out.println("cube length"+this.length);
        System.out.println("cube super length"+super.length);
        System.out.println("cube breadth"+this.breadth);
        System.out.println("cube height"+this.height);
    }

    public int getArea(){
        return (this.length+this.breadth)*2*this.height;
    }

    public int getVolume(){
        return (this.length*this.breadth)*this.height;
    }


}


public class MethodOverLoad {
    public static void main(String[] args) {

        //
//        Rectangle rec = new Rectangle(2,3);
//        System.out.println(rec.getArea());
//        System.out.println(rec.getPerimeter());

//        Cuboid cube = new Cuboid(2,3, 4);
//        System.out.println(cube.getArea());
//        System.out.println(cube.getPerimeter());
//        System.out.println(cube.getVolume());

        Rectangle rcube = new Cuboid(1,1, 1);
        System.out.println(rcube.getArea());
        System.out.println(rcube.getPerimeter());



    }


}
