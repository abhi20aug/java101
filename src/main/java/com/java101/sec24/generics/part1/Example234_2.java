package com.java101.sec24.generics.part1;

class MyKeyValue<K,V>{
    K key = (K) new Object();
    V value = (V) new Object();
}

public class Example234_2 {
    public static void main(String[] args) {

        MyKeyValue<Integer, String> kv = new MyKeyValue<>();
        kv.key =10;
        kv.value = "abhishek";

        System.out.println(kv.key);
        System.out.println(kv.value);

    }

}
