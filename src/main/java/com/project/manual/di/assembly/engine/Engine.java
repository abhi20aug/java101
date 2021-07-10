package com.project.manual.di.assembly.engine;

public class Engine {
    private SparkPlug sparkPlug;
    private CrankShaft crankShaft;
    private Piston piston;

    public Engine(SparkPlug sparkPlug, CrankShaft crankShaft, Piston piston) {
        this.sparkPlug = sparkPlug;
        this.crankShaft = crankShaft;
        this.piston = piston;
    }

    public void start() {
        System.out.println("start");
    }
}
