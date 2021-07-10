package oop.example.inheritance;

class Super{
    public void method1(){
        System.out.println("method-1");
    }
    public void method2(){
        System.out.println("Super method-2");
    }
}

class Sub extends  Super{
    public void method2(){
        System.out.println("sub method-2");
    }
    public void method3(){
        System.out.println("method-3");
    }
}

public class DynamicMethodDispatchTest {
    public static void main(String[] args) {
        System.out.println("--------------");
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}

//--------
//s =>
//meth1--super
//meth2--super shadowed
//meth2--sub
//meth3--sub -> not accessible if Super = new Sub()
//when Super class is used as template to create object of subclass
//method -3 is not available in super, hence not acceible.





