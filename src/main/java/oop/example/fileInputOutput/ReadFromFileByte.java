package oop.example.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFileByte {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/test/write2file.txt");
        int x = 0;
        int y = 0;
        byte b[] = new byte[fis.available()];
        while ( (x = fis.read()) != -1) {
                b[y] = (byte)x;
                y++;
                System.out.println((char)x);
        }

        String str = new String(b);
        System.out.println(str);

    }
}
