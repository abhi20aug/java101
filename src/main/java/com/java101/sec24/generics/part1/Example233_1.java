package com.java101.sec24.generics.part1;

//generic class can hold it of any type
class Data<T>{
    private T data;
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}

public class Example233_1 {
    public static void main(String[] args) {
        Data<Integer> dt = new Data<>();
        dt.setData(10);
        System.out.println(dt.getData());

        Data<String> str = new Data<>();
        str.setData("test");
        System.out.println(str.getData());
    }
}
