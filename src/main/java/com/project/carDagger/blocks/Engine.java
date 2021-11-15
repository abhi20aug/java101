package com.project.carDagger.blocks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Engine {
    Piston piston;
    SparkPlug sparkPlug;

    void start(){
        System.out.println("starting engine...");
    }
}
