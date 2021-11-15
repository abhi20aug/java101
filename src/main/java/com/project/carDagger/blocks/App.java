package com.project.carDagger.blocks;

import com.project.carDagger.dagger.CarComponent;
import com.project.carDagger.dagger.DaggerCarComponent;
import com.project.daggerExample.daggertutorial.Restaurant;

public class App {
    public static void main(String[] args) {

        useDaggerDI();

    }

    static void useDirectDI(){
        Piston piston = new Piston();
        SparkPlug sparkPlug = new SparkPlug();
        Engine engine = new Engine(piston, sparkPlug);

        Rubber rubber = new Rubber();
        Frame frame = new Frame();
        Wheels wheels = new Wheels(rubber, frame);
        Car car = new Car(engine, wheels);

        car.wheels.inflate();
        car.engine.start();

    }

    static void useDaggerDI(){

        CarComponent carComponent = DaggerCarComponent.builder().build();
        Car car1 = carComponent.car();
        Car car2 = carComponent.car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        car1.engine.start();
        car1.wheels.inflate();
    }
}


