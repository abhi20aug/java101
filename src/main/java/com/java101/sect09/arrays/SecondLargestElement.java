package com.java101.sect09.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        //find sum of all element;
        int[] studentMarks = {3,7,6,4,8,9,3,7,11,12,8,9,0,1,2,3,4,5,1,10};
        int sum =0;
        for(int x:studentMarks){
            sum = sum+x;
        }
        System.out.println("sum :"+sum);

        //search 4 place in array
        int t=0;
        for(int y=0; y < studentMarks.length; y++){
            if (studentMarks[y]==4){
                System.out.println(" found at place "+y);
                t =y;
                break;
            }
        }
        System.out.println("y :"+t);

        //Finding Maximum element
        int max =0;

        for(int z =0; z < studentMarks.length -1; z++){
            //first
            System.out.println("start "+ studentMarks[z]) ;
            //second
            System.out.println("next "+ studentMarks[z+1]) ;
            //compare
            System.out.println("compare ") ;
            if(studentMarks[z+1]> studentMarks[z]){
                if (studentMarks[z+1] >=max){
                    max = studentMarks[z+1];
                }
                System.out.println("max: "+max) ;
            } else {
                if (studentMarks[z] >=max) {
                    max = studentMarks[z];
                }
                System.out.println("max: "+max) ;
            }
        }
        System.out.println(" max: "+max);


        //Finding 2nd Maximum element
        int max1=0;
        int max2=0;

        for(int z =0; z < studentMarks.length -1; z++) {
            if (studentMarks[z] > max1) {
                max2 = max1;
                max1 = studentMarks[z];
            } else if(studentMarks[z] > max2){
                System.out.println(" reached..."+studentMarks[z]);
            }
        }

        System.out.println(" max1: "+max1);
        System.out.println(" max2: "+max2);
    }
}
