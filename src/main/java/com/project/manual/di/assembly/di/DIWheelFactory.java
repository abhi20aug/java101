package com.project.manual.di.assembly.di;

import com.project.manual.di.assembly.wheel.Frame;
import com.project.manual.di.assembly.wheel.Rubber;
import com.project.manual.di.assembly.wheel.Wheel;

public class DIWheelFactory {

    public static Wheel getWheel(){
        return new Wheel(getRubber(),getFrame());
    }

    private static Rubber getRubber(){
        return new Rubber();
    }

    private static Frame getFrame(){
        return new Frame();
    }
}
