package com.project.manual.di.assembly;

import com.project.manual.di.assembly.di.DICarFactory;

public class MainApp {

    public static void main(String[] args) {
        Car hondaCar = DICarFactory.getCar();
        hondaCar.driveCar();
    }

}
