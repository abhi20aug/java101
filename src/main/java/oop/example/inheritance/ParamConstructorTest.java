package oop.example.inheritance;

class aParent{

    public aParent(){
        System.out.println("Parent np constructor executed");
    }
    public aParent( int x){
        System.out.println("Parent param constructor executed"+x);
    }

}

class aChild extends  aParent{

    public aChild(){
        System.out.println("Child np constructor executed");
    }

    public aChild( int x, int y){
        super(x);
        System.out.println("achild param constructor executed"+y);
    }
}

class agrandChild extends aChild
{
    public agrandChild(){
        System.out.println("grandChild np constructor executed");
    }

    public agrandChild( int x, int y, int z){
        super(x,y);
        System.out.println("agrandChild param constructor executed"+z);
    }


}


public class ParamConstructorTest {
    public static void main(String[] args) {
        System.out.println("test");

        agrandChild agd = new agrandChild(1,2,3);


    }
}

