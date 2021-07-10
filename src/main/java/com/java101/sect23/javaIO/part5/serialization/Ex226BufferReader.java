package com.java101.sect23.javaIO.part5.serialization;

import java.io.*;

public class Ex226BufferReader {

    public static void main(String[] args) throws IOException {

        //FileInputStream=>InputStreamReader=>BufferedReader
        FileInputStream fileInputStream = new FileInputStream("C://Users//abhiagr//myStudent2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Student s = new Student();

        s.rollNo = Integer.parseInt(bufferedReader.readLine());
        s.name = bufferedReader.readLine();
        s.dept = bufferedReader.readLine();

        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.dept);





    }
}
