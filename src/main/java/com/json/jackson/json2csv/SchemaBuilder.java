package com.json.jackson.json2csv;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;

public class SchemaBuilder {

    public static void main(String[] args) throws IOException {
       buildSchema();
    }

    public static void buildSchema() throws IOException {

        //First, we use Jackson's ObjectMapper to read our example JSON document into a tree of JsonNode objects:
        JsonNode jsonTree = new ObjectMapper().readTree(new File("src/main/java/com/json/jackson/json2csv/jsonList.json"));
        System.out.println(jsonTree);

        //create a CsvSchema. This determines the column headers, types,
        //and sequence of columns in the CSV file.
        //To do this, we create a CsvSchema Builder and set the column headers to match the JSON field names:
        JsonNode firstObject = jsonTree.elements().next();
        Builder csvSchemaBuilder = CsvSchema.builder();

        firstObject.fieldNames().forEachRemaining(fieldName -> {
                csvSchemaBuilder.addColumn(fieldName);
            }
        );

        CsvSchema csvSchema = csvSchemaBuilder.build().withHeader().withQuoteChar('"');
        System.out.println(csvSchema);

        //create a CsvMapper with our CsvSchema, and finally, we write the jsonTree to our CSV file:
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.writerFor(JsonNode.class)
                .with(csvSchema)
                .writeValue(new File("src/main/java/com/json/jackson/json2csv/orderLines.csv"), jsonTree);



    }
}
