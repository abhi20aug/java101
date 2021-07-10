package oop.example.exceptions;

public class ExceptionExampleArthemetic {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            //Exception in thread "main" java.lang.ArithmeticException: / by zero
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }


}
