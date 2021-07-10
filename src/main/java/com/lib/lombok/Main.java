package com.lib.lombok;

public class Main {
    public static void main(String[] args) {

        QrCodeReq qrCodeReq = QrCodeReq.builder().intentUrl("http://test.com").additionalInfo("addinfo").build();

        System.out.println("qr url"+qrCodeReq.getIntentUrl());

    }
}
