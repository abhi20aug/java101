package com.java101.sec24.generics.part1;

import java.lang.Number;

//Number
//float, double, int, long only
class A{};
class B extends A{};
class C extends A{};

interface AI{};
class B1 implements AI{};
class C1 implements AI{};


class MyArray5<T extends A>{

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

//if class extends is an Interface, use extends only.
class MyArray6<T extends AI>{

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



public class Example234_4 {
    public static void main(String[] args) {

//        MyArray5<Integer> maObj = new MyArray5();
//        maObj.append(10);
//        maObj.append(10.11);
//        maObj.append(10.11f);
//        maObj.append(17874576);
        MyArray5<A> maObjA = new MyArray5();
        MyArray5<B> maObjB = new MyArray5();
        MyArray5<C> maObjC = new MyArray5();

        MyArray6<AI> maObjAI = new MyArray6();
        MyArray6<B1> maObjb1 = new MyArray6();
        MyArray6<C1> maObjc1 = new MyArray6();

//        maObjAI.append(10);



    }
}
