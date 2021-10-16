package com.java101.sect09.arrays;

public class Declare {
    public static void main(String[] args) {
        int[] studentRollNo =  {101,102,103, 104, 105};

        System.out.println(studentRollNo.length);

        int[] classes = new int[10];
        //Tye  //Reference  //Object [4][4][4][4][4]*5 = 20

        //        for(int i=0; i <classes.length; i++){
        //            System.out.println("Class"+classes[i]);
        //        }


        for(int i=0; i <classes.length; i++){
            classes[i] = i+1;
            System.out.println("Class"+classes[i]);
        }

        //for each x in classes
        // no need of length of array, forward direction only
        for(int x: classes){
            System.out.println("Class "+x);
        }

        for(int y: studentRollNo){
            System.out.println("student: "+y);
        }


//        array created in heap.





    }
}
