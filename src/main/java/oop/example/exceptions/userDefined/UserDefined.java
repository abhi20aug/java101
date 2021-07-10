package oop.example.exceptions.userDefined;

import java.util.Scanner;

class MinBalanceException extends Exception{
    @Override
    public String toString() {
        final String s = "Min Balance should be > 5000";
        return s;
    }
}

public class UserDefined {

    static void fun1(){
        try {
            int a;
//            System.out.println(1 / 0);
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number");
            a = sc.nextInt();

            if ( a < 5000 ){
                throw new MinBalanceException();
            }
        }
        catch (MinBalanceException e1){
            System.out.println(e1.toString());
        }

        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
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
