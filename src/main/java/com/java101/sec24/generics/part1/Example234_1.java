package com.java101.sec24.generics.part1;

class MyArray3<T>{

    T arr[] = (T[])new Object[10];
    int length =0;

    void append(T val){
        arr[length++] = val;
    }

    void display(){

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class Example234_1 {

    public static void main(String[] args) {

        //if we dont give any parameter of generic type, like Integer
        MyArray3 arr1 = new MyArray3<>();
        arr1.append(10);
        arr1.append("hi");
        arr1.display();
    }
}
