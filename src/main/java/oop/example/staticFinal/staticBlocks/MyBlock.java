package oop.example.staticFinal.staticBlocks;

public class MyBlock {

    static int var;

    static {
        System.out.println("block 1 var: "+var);
        var = 10;
        System.out.println("block 1 var: "+var);
    }

    static {
        System.out.println("block 2 var: "+var);
        var =20;
        System.out.println("block 2 var: "+var);
    }

//    public static void main(String[] args) {
//        //    MyBlock mb = new MyBlock();
//    }

}
