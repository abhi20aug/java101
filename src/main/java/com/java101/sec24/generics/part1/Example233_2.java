package com.java101.sec24.generics.part1;

class MyArray<T>{
    T arr[] = (T[])new Object[10];
    int length =0;

    //
    void append(T value){
        arr[length++] = value;
    }
    //display data
    void display(){
        //foreach (Type var:collection)
//        for (T x:arr) {
//            System.out.println(x);
//        }
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

    }

}

public class Example233_2 {

    public static void main(String[] args) {

        MyArray<Integer> arr = new MyArray();
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.display();

        MyArray<String> arr1 = new MyArray();
        arr1.append("hi");
        arr1.append("abhi");
        arr1.display();

    }

}
