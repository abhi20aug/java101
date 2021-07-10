package com.java101.sect23.javaIO.part5.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
    long rollNo;
    String dept;
    String name;
}


public class Ex226PrintStream {

    public static void main(String[] args) throws IOException {

        //write data to file

        FileOutputStream fileOutputStream = new FileOutputStream("C://Users//abhiagr//myStudent2.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);

        Student s = new Student();
        s.dept="ceramic";
        s.rollNo=20011024;
        s.name="abhishek agrawal";

        printStream.println(s.rollNo);
        printStream.println(s.name);
        printStream.println(s.dept);

        printStream.close();
        fileOutputStream.close();



    }


}
