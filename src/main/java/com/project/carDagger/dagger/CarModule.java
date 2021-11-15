package com.project.carDagger.dagger;

import com.project.carDagger.blocks.Car;
import com.project.carDagger.blocks.Engine;
import com.project.carDagger.blocks.Frame;
import com.project.carDagger.blocks.Piston;
import com.project.carDagger.blocks.Rubber;
import com.project.carDagger.blocks.SparkPlug;
import com.project.carDagger.blocks.Wheels;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class CarModule {

    @CarScope
    @Provides
    static Car car(Engine engine, Wheels wheels) {
        return new Car(engine, wheels);
    }

    @CarScope
    @Provides
    static Engine engine(Piston piston, SparkPlug sparkPlug) {
        return new Engine(piston, sparkPlug);
    }

    @CarScope
    @Provides
    static Piston piston(){
        return new Piston();
    }

    @CarScope
    @Provides
    static SparkPlug sparkPlug(){
        return new SparkPlug();
    }

    @CarScope
    @Provides
    static Wheels wheels(Rubber rubber, Frame frame){
        return new Wheels(rubber, frame);
    }

    @CarScope
    @Provides
    static Rubber rubber(){
        return new Rubber();
    }

    @CarScope
    @Provides
    static Frame frame(){
        return new Frame();
    }

}
