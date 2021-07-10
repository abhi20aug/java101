package oop.example.exceptions;

import java.util.Scanner;

public class ExcScanner {

    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number#");
        a = sc.nextInt();
        System.out.println("Enter Number#");
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Please enter number#2 value as non-zero");
        }
    }
}
