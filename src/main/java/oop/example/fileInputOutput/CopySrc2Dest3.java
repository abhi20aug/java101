package oop.example.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopySrc2Dest3 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/test/source1.txt");
        FileOutputStream fos= new FileOutputStream("C:/test/dest3.txt");
        int x;
        while((x=fis.read())!=-1){
            if (x >=65 && x <= 90)
                fos.write(x+32);
            else
                fos.write(x);
        }
        fis.close();
        fos.close();

    }
}
