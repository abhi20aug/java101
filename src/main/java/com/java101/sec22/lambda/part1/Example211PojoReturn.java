package com.java101.sec22.lambda.part1;

import sun.text.resources.cldr.zh.FormatData_zh_Hans_SG;

interface QrCodePojoI{
    QRUrl getQRCode(QRCode qrc);
}

public class Example211PojoReturn {

    public static void main(String[] args) {

        QRCode qrcode = new QRCode();
        qrcode.setUrl("http://test.com");//url
        qrcode.setParam1("INV74527645");//OrderNum
        qrcode.setParam2("ERRFR");      //vendorCode
        qrcode.setParam3("20082021");   //orderDate
        qrcode.setParam4("4526453322"); //orderId

        QrCodePojoI qri = (qrc)->{
            QRUrl qu = new QRUrl();
            qu.setQrcodeurl(qrc.getUrl()
                        +"/"+qrc.getParam1()
                        +"/"+qrc.getParam2()
                        +"/"+qrc.getParam3()
                        +"/"+qrc.getParam4());
            qu.setMsgId("65434646543");
            return qu;
        };

        QRUrl qrurl =  qri.getQRCode(qrcode);

        System.out.println(qrurl.getQrcodeurl());
        System.out.println(qrurl.getMsgId());
        System.out.println(qrurl.toString());

    }




}
