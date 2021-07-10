package com.json.jackson.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.jackson.pojo.QrSqsReq;
import java.io.File;
import java.io.IOException;

// pojo Object should be there.
// ObjectMapper
// Path Define where file to written
// writeValue(new File(path),pojoObject)

public class Serialization_Object2JsonFile_Demo {

    public static void main(String[] args) throws IOException {

        QrSqsReq qrSqsReq = new QrSqsReq("trxNum12346", 101, "https://upi.org/12345", 6786757, 856546566, "12062021");

        ObjectMapper mapper = new ObjectMapper();

        String path = "C://Users//abhiagr//IdeaProjects//java101//src//main//java//com//json//jackson//QRCodeMsgFile.json";

        mapper.writeValue(new File(path),qrSqsReq);

       }
}
