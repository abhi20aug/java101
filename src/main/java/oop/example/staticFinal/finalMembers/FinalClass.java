package oop.example.staticFinal.finalMembers;

public final class FinalClass {
    final int x =10;
    void show(){
        System.out.println("Method can not be oveeridn");
    }
}

//class test extends FinalClass{
//
//    public static void main(String[] args) {
//        System.out.println("extend from final");
//    }
//}