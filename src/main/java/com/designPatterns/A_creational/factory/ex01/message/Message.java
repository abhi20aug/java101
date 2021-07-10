package com.designPatterns.A_creational.factory.ex01.message;

import java.time.LocalDate;

public abstract class Message {

    String messageHeader;
    String message;
    String encryptedMsg;

    public abstract String getContents();

    public void setMessageHeader(){
        this.messageHeader = "***Message Header** Date"+ LocalDate.now();
    };

    public void encryptMessage(){
        StringBuilder strb = new StringBuilder();
        this.encryptedMsg = strb.append(message).reverse().toString();
        System.out.println("encrypt Message"+encryptedMsg);
    };

    @Override
    public String toString() {
        return "Message{" +
                "messageHeader='" + messageHeader + '\'' +
                ", message='" + message + '\'' +
                ", encryptedMsg='" + encryptedMsg + '\'' +
                '}';
    }
}
