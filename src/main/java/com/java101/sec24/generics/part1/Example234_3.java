package com.java101.sec24.generics.part1;

class MyArray4<T>{

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

class MyArrayObj extends  MyArray4{};
class MyArrayStr extends  MyArray4<String>{};
class MyArrayInt extends  MyArray4<Integer>{};

class MyArrayGen<T> extends  MyArray4<T>{};


public class Example234_3 {
    public static void main(String[] args) {
        MyArray4 maObj = new MyArray4();
        maObj.append("Hi");
        maObj.append("bye");
        maObj.append(10);

        MyArray4<String> maStr = new MyArray4();
        maStr.append("Hi");
        maStr.append("bye");
        //maStr.append(10);

        MyArrayStr maStr1 = new MyArrayStr();
        maStr1.append("Hi");
        maStr1.append("Bye");

        MyArrayInt maInt = new MyArrayInt();
        maInt.append(10);
        maInt.append(0);

        MyArrayGen<String> maG = new MyArrayGen();
        maG.append("Hi");
        maG.append("bye");


    }
}
