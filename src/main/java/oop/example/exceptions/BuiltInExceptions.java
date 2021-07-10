package oop.example.exceptions;
import java.io.*;
public class BuiltInExceptions {

    static void fun1(){
        try {
//            System.out.println(1 / 0);



            FileInputStream fs = new FileInputStream("my.txt");

//            if (fs.available() ==0 )
//                System.out.println("file availanle");
//            else
//                System.out.println("file not availanle");

        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.toString());
        }
        catch(ArithmeticException e2){
            System.out.println(e2.toString());
        }
        catch(FileNotFoundException e3){
            System.out.println("exception");
            System.out.println(e3.toString());
        }


    }

    static void fun2(){
        fun1();
    }

    static void fun3(){
        fun2();
    }


    public static void main(String[] args) {

        fun3();

    }


}
