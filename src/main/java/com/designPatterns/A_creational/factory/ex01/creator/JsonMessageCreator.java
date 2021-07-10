package com.designPatterns.A_creational.factory.ex01.creator;

import com.designPatterns.A_creational.factory.ex01.message.JsonMessage;
import com.designPatterns.A_creational.factory.ex01.message.Message;

public class JsonMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }

}
