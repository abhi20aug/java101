package com.project.carDagger.blocks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Car {
    Engine engine;
    Wheels wheels;
}
