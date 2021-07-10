package oop.example.interfaces.challenge1;

import javax.swing.*;
import java.lang.reflect.Member;

public class Store {

    String name ;

    public void Store(String n){
        this.name = n;
    }

    int i;
    //create an array of all members
    IMember member[] = new IMember[100];

    //register members
    public void register(IMember m){
        member[i] = m;
    }

    public void inviteSale(){
        for(i=0; i <= 100; i++){
            member[i].callback();
        }
    }
}

