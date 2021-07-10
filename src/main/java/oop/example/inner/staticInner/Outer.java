package oop.example.inner.staticInner;

//Objects of static inner can be created without creating object of outer class

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Outer {
    static int x =10;

    static class StaticInner{
        //int y = 10;

        static String staticDisplay(){
            System.out.println("StaticInner.staticDisplay Starts");
            System.out.println(" x: "+x);
            //System.out.println(" y: "+y);
            System.out.println("StaticInner.staticDisplay Ends");
            return "ends";
        }
    }

}
