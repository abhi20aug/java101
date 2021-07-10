package com.project.manual.di.assembly;

import com.project.manual.di.assembly.engine.Engine;
import com.project.manual.di.assembly.wheel.Wheel;

public class Car {

    private final Engine engine;
    private final Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void driveCar(){
        engine.start();
        wheel.infalte();
        System.out.println("driving");
    }

    /*public static Car getCar(){
        Piston piston = new Piston();
        SparkPlug sparkPlug = new SparkPlug();
        CrankShaft crankShaft = new CrankShaft();
        Engine engine = new Engine(sparkPlug,crankShaft,piston);

        Rubber rubber = new Rubber();
        Frame frame = new Frame();
        Wheel wheel = new Wheel(rubber,frame);

        return new Car(engine, wheel);
    }*/
}
