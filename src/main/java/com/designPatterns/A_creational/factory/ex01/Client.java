package com.designPatterns.A_creational.factory.ex01;

import com.designPatterns.A_creational.factory.ex01.creator.JsonMessageCreator;
import com.designPatterns.A_creational.factory.ex01.creator.MessageCreator;
import com.designPatterns.A_creational.factory.ex01.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        //printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator msgCreator){
        Message msg = msgCreator.getMessageObject();
        System.out.println(msg.getContents());
        msg.getContents();
        System.out.println(msg);
    }
}
