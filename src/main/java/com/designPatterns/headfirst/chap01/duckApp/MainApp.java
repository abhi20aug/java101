package com.designPatterns.headfirst.chap01.duckApp;

public class MainApp {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();
        readHeadDuck.quack();
        readHeadDuck.swim();

    }
}
