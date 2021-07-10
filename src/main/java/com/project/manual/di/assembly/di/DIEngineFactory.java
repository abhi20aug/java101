package com.project.manual.di.assembly.di;

import com.project.manual.di.assembly.engine.CrankShaft;
import com.project.manual.di.assembly.engine.Engine;
import com.project.manual.di.assembly.engine.Piston;
import com.project.manual.di.assembly.engine.SparkPlug;

public class DIEngineFactory {

    public static Engine getEngine(){

        Piston piston = getPiston();
        SparkPlug sparkPlug = getSparkPlug();
        CrankShaft crankShaft = getCrankShaft();
        return new Engine(sparkPlug,crankShaft,piston);
    }

    private static CrankShaft getCrankShaft(){
        return new CrankShaft();
    }

    private static Piston getPiston(){
        return new Piston();
    }

    private static SparkPlug getSparkPlug(){
        return new SparkPlug();
    }

}
