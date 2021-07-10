package oop.example.staticFinal.staticMembers;

public class StaticMethod {

    static int sm;
    //create a static method
    public static void SetSM(){
        //setting value of static member
        sm =10;
    }

    public static void displaySM(int x){
        System.out.println("displaySM x"+x);
        System.out.println("displaySM x*sm"+x*sm);
    }


}
