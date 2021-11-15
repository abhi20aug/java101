package com.project.carDagger.blocks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Wheels {
    Rubber rubber;
    Frame frame;

    void inflate(){
        System.out.println("inflating wheel...");
    }

}
