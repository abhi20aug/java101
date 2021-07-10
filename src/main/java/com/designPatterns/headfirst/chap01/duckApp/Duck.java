package com.designPatterns.headfirst.chap01.duckApp;

public abstract class Duck {

    //behaviours that was thought to be inherited by most duck
    void quack(){
        System.out.println("quack quack...");
    };
    void swim(){
        System.out.println("...swimming...");
    };

    //behaviour that will be implemented bu subclases
    abstract void display();
}
