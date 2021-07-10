package oop.example.fileInputOutput;

import java.io.*;

public class CopyFrom2File2One {

    public static void main(String[] args) throws IOException {

        FileInputStream fis1 = new FileInputStream("C:/test/source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/test/dest3.txt");
        FileOutputStream fos = new FileOutputStream("C:/test/dest4.txt");

        SequenceInputStream sis= new SequenceInputStream(fis1, fis2);

        int x;
        while((x=sis.read())!=-1){
            fos.write(x);
        }

        sis.close();
        fos.close();
    }

}
