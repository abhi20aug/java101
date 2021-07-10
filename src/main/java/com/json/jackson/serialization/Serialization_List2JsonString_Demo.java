package com.json.jackson.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Serialization_List2JsonString_Demo {
    public static void main(String[] args) throws JsonProcessingException {

        List<String> qrItemList = new ArrayList<>();
        qrItemList.add("trxNumber:4646536745");
        qrItemList.add("qrText:https://upi.org");

        ObjectMapper mapper = new ObjectMapper();
        String qrList =  mapper.writeValueAsString(qrItemList);
        System.out.println(qrList);
    }
}
