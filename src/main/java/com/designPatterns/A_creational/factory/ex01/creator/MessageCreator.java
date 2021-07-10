package com.designPatterns.A_creational.factory.ex01.creator;

import com.designPatterns.A_creational.factory.ex01.message.Message;

public abstract class MessageCreator {

    public Message getMessageObject() {
        //get Object
        Message msg =  createMessage();

        //additional processing
        msg.setMessageHeader();
        msg.encryptMessage();

        //return message Object
        return msg;
    }

    public abstract Message createMessage();

}
