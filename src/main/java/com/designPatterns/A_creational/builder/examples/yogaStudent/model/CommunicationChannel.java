package com.designPatterns.A_creational.builder.examples.yogaStudent.model;

public class CommunicationChannel {

    private String email;
    private String phone;
    private Messenger messenger;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }
}
