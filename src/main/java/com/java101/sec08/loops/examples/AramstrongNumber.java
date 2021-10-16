package com.java101.sec08.loops.examples;

public class AramstrongNumber {
    public static void main(String[] args) {

        //display digit
        //n = 257
        int n = 7783006;
        for(; n >0;  ){
            int r = n%10;
            System.out.println("remainder "+r);
            n = n/10;
        }

        //count Digits
        int k = 778384666;
        int c = 0;
        for(; k >0;  ){
            c = c+1;
            k = k/10;
        }
        System.out.println("digit count "+c);

        //Check if Number is armstrong or not
        // if n = 153
        // 3cube + 5 cube + 1 cube
        // 27 + 125 + 1
        // 153
        // if digit cubes added together = number
        //display digit
        int a = 456;

        for ( int t = 1; t < 1000; t++){
            int sum = 0;
            a = t;
            for(; a >0;  ){
                int r = a%10;
                sum = sum+r*r*r;
                a = a/10;
            }
            //System.out.println("sum = "+sum);
            //System.out.println("t = "+t);
            //check if number is armstrong number
            if (sum == t){
                System.out.println("found "+t);
            }
        }


        //reverse digit of number
        int z = 675560;
        int x =0 ;
        int rev =0;
        while(z >0 ){
            int r = z%10;
            z = z/10;
            rev = rev*10+ r;

        }
        System.out.println("rev :"+rev);

        //Palindrom between 1 to 1000
        //n 12521
        //rev 12521
        //reverse digit of number
        for ( int b= 101; b < 200; b++ ){
            int reverse =0;
            int temp = b;
            while(temp >0 ){
                int r = temp%10;
                temp = temp/10;
                reverse = reverse*10+ r;
            }
            if(reverse == b ) {
                System.out.println("palindrom :" + reverse);
            }
        }

    }

}
