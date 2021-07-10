package com.project.daggerExample.daggertutorial;

public class Manager {
    private Host host;
    private Waiter waiter;
    private Cook cook;

    public Manager(
            Host host,
            Waiter waiter,
            Cook cook) {
        System.out.println("Constructor for Manager called");
        this.host = host;
        this.waiter = waiter;
        this.cook = cook;
    }
}
