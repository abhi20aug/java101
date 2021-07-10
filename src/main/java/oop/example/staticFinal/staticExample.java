package oop.example.staticFinal;

class Test{
    static int x=10;
    int y=10;

    public int show(){
        System.out.println("x:"+x);
        return x;
    }
    static public int staticShow(int z){
        System.out.println("x:"+x);
        System.out.println("this.y:"+z);
        return x+z;
    }

    public int nonStaticShow(int y){
        System.out.println("x:"+x);
        System.out.println("this.y:"+this.y);
        System.out.println("y:"+y);
        return x+y+this.y;
    }


}





public class staticExample {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.show());
        System.out.println(Test.staticShow(10));
        System.out.println(t.staticShow(10));
    }


}
