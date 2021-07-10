package com.json.jackson.serialization;


//process of converting Object into jSonString.
//Pass this over Network



import com.fasterxml.jackson.core.JsonProcessingException;
import com.json.jackson.pojo.QrSqsReq;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Object2JsonString_Demo {


    public static void main(String[] args) {

        String jsonString="";
        //instantiate object
        QrSqsReq qrSqsReq = new QrSqsReq("trxNum12345", 101, "https://upi.org/12345", 6786757, 856546566, "12062021");

        //Object Mapper
        ObjectMapper mapper = new ObjectMapper();

        //pass object into Mapper with method writeValueAsString
        try {
            jsonString = mapper.writeValueAsString(qrSqsReq);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }

}


//fields should be public in Class
//fields names become Key.
