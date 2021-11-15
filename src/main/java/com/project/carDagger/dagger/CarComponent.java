package com.project.carDagger.dagger;

import com.project.carDagger.blocks.Car;
import com.project.carDagger.blocks.Engine;
import com.project.carDagger.blocks.Wheels;
import dagger.Component;

@CarScope
@Component(modules = {
        CarModule.class
})
public interface CarComponent {
    Car car();
}
