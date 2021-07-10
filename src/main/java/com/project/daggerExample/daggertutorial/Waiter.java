package com.project.daggerExample.daggertutorial;

public class Waiter {
    private Cook cook;

    public Waiter(Cook cook) {
        System.out.println("Constructor for Waiter called");
        this.cook = cook;
    }
}
