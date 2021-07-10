package com.json.jackson.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.jackson.pojo.QrSqsReq;

import java.io.File;
import java.io.IOException;

public class DeSerialization_JsonFile2Object_Demo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String infilepath = "C://Users//abhiagr//IdeaProjects//java101//src//main//java//com//json//jackson//deserialization//input.json";
        QrSqsReq qr = mapper.readValue(new File(infilepath),QrSqsReq.class);
        System.out.println(qr.getQrCodeUrlText());
    }
}
