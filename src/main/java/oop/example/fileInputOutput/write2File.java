package oop.example.fileInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class write2File {

    public static void main(String[] args) {

        try {
             FileOutputStream fos = new FileOutputStream("C:/test/write2file.txt");
             String str= "testing of writing string to file";

             //method-1 using write
                //             byte[] b= str.getBytes();
                //             for(byte x:b){
                //                 fos.write(x);
                //             }
                //             fos.close();

            //method2 using write(byte[])
            fos.write(str.getBytes());

            //method-3
            //fos.write(str.getBytes(),10,str.length()-10);


        } catch (IOException e) {
            e.printStackTrace();
        }

        ;


    }
}
