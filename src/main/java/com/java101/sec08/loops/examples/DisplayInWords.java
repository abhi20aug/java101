package com.java101.sec08.loops.examples;

public class DisplayInWords {
    public static void main(String[] args) {
        // 237
        // two three seven

        //first reverse number
        int i = 1700;
        int x =i ;
        int rev =0;
        StringBuilder reverse = new StringBuilder();
        while(x >0 ){
            int r = x%10;
            x = x/10;
            rev = rev*10+ r;
            reverse.append(r);
        }
        System.out.println("rev :"+rev);
        System.out.println("reverse :"+reverse);

        for (int k = 0; k < reverse.length(); k++){
            //System.out.println(reverse.charAt(k));
            char j = reverse.charAt(k);
            System.out.print (" "+printNumber(j));
        }

    }

    private static String printNumber(char r) {
        if ( r == '0'){
            return "one";
        }
        if (r == '1'){
            return "one";
        }
        if (r == '2'){
            return "two";
        }
        if (r == '3'){
            return "three";
        }
        if (r == '4'){
            return "four";
        }
        if (r == '5'){
            return "five";
        }
        if (r == '6'){
            return "six";
        }
        if (r == '7'){
            return "seven";
        }
        if (r == '8'){
            return "eight";
        }
        if (r == '9'){
            return "nine";
        }

        return null;
    }
}
