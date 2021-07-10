package com.project.manual.di.assembly.wheel;

public class Wheel {

    private Rubber rubber;
    private Frame frame;

    public Wheel(Rubber rubber, Frame frame) {
        this.rubber = rubber;
        this.frame = frame;
    }

    public void infalte() {
        System.out.println("inflating");
    }
}
