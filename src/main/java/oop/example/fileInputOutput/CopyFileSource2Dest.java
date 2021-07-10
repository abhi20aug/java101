package oop.example.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileSource2Dest {


    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/test/source1.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String str = new String(b);
        System.out.println(str);
        fis.close();

        FileOutputStream fos = new FileOutputStream("C:/test/dest1.txt");
        fos.write(str.toLowerCase().getBytes());
        fos.close();

        FileInputStream fisd = new FileInputStream("C:/test/dest1.txt");
        byte bd[] = new byte[fisd.available()];
        fisd.read(bd);
        String str2 = new String(bd);
        System.out.println(str2);
        fisd.close();


    }


}
