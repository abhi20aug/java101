package com.json.jackson.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class Serialization_Map2JsonString_Demo {
    public static void main(String[] args) throws JsonProcessingException {
        HashMap<String, String> map = new HashMap<>();
        map.put("trxNumber","723542534");
        map.put("upiText","https://upi.org");
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(map);
        System.out.println(jsonStr);
    }
}
