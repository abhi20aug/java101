package com.json.jackson.deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.jackson.pojo.QrSqsReq;

// Process of Converting json String into Object is called
// Deserialization
//input:
    // jsonString
    // ObjectMapper
    // mapper.readValue(jsonString, <Object>.class)
//output
    // read the jsonString and map each keys to correct dataType
    // read the jsonString and map each keys to correct value for each Attribute of Class

public class DeSerialization_JsonString2Object_Demo {
    public static void main(String[] args) throws JsonProcessingException {

        String jsonStr="{\"trxNumber\":\"trxNum12345\",\"orgId\":101,\"qrCodeUrlText\":\"https://upi.org/12345\",\"ofaRequestId\":6786757,\"customerTrxId\":856546566,\"dateTime\":\"12062021\"}";

        ObjectMapper mapper = new ObjectMapper();

        QrSqsReq qrSQS = mapper.readValue(jsonStr, QrSqsReq.class);

        System.out.println(qrSQS.getQrCodeUrlText());
    }
}
