package oop.example.polymorphism;

//achieved by
//method overloading
//method overriding

//overloading

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

class overload{
    public int max(int a, int b){
        return a>b?a:b;
    }
    public int max(int a, int b, int c){
        if (a > b && b > c ) return a;
        else if (b > c ) return b;
        return c;
    }
}


public class aTest {
    public static void main(String[] args) {
        overload ol = new overload();
        System.out.println(ol.max(1,2,3));
        System.out.println(ol.max(1,2));
    }
}
