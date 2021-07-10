package com.java101.sec22.lambda.part1;

import com.java101.sec22.lambda.part1.QRCode;

//interface having a method and input as pojo QRCode
interface myQRCodeI {
    void display(QRCode qrc);
}

public class Example211QR {

    public static void main(String[] args) {

        QRCode qrcode = new QRCode();
        qrcode.setUrl("http://test.com");//url
        qrcode.setParam1("INV74527645");//OrderNum
        qrcode.setParam2("ERRFR");      //vendorCode
        qrcode.setParam3("20082021");   //orderDate
        qrcode.setParam4("4526453322"); //orderId

        myQRCodeI qr = (qrc)->{
            System.out.println(qrc.getUrl()
                    +"/"+qrc.getParam1()
                    +"/"+qrc.getParam2()
                    +"/"+qrc.getParam3()
                    +"/"+qrc.getParam4()
            );
        };

        qr.display(qrcode);

    }


}
