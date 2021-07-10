package oop.example.fileInputOutput;

import java.io.*;

public class CopySrc2Dest2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/test/source1.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        int y=0;
        for(byte x:b){

            if (x >=65 && x <= 90 )
                b[y] = (byte) (x+32); //(byte)((int)x+32);
            else
                b[y] =  x; //(byte)((int)x);
            y++;
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("C:/test/dest2.txt");
        fos.write(b);
        fos.close();

    }
}
