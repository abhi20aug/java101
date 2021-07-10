package com.designPatterns.A_creational.factory.ex01.message;

public class JsonMessage extends Message{

    @Override
    public String getContents() {
        return "JSON [{/}]";
    }
}
