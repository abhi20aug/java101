package oop.example.staticFinal.SeqGeneration;

import java.util.Calendar;
import java.util.Date;

public class Student {

    private String name;
    private String rollNo;
    String Univ = "BHU";
    private static int seq=0;

    public Student(String name){
        this.name = name;
        this.rollNo = setRollNo();
    }

    private String setRollNo(){
        seq = seq +1;

        Date d = new Date();
        int a = d.getYear() +1900;
        rollNo = Univ +"_"+a+"_"+seq;
        return rollNo;
    }

    public String getRollNo() {
        return this.rollNo;
    }


}
