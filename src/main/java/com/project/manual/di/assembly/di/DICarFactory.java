package com.project.manual.di.assembly.di;

import com.project.manual.di.assembly.Car;
import com.project.manual.di.assembly.engine.Engine;
import com.project.manual.di.assembly.wheel.Wheel;

public class DICarFactory {

    public static Car getCar(){
        Engine engine = DIEngineFactory.getEngine();
        Wheel wheel = DIWheelFactory.getWheel();
        return new Car(engine, wheel);
    }

}
