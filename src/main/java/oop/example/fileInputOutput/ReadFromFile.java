package oop.example.fileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/test/write2file.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);


            System.out.println(str);
            int x=0;
            for(byte y:b){
                x++;
                System.out.println("reading pos: "+x);
                System.out.println("(char)y :"+(char) y);
                System.out.println("(int) y :"+(int) y);
                System.out.println("y: "+y);
                System.out.println("*****: ");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
