package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class InvoiceManager {

    // Get invoice items from invoice.json and print
    // total quantity, price, avg
    public static void main(String[] args) {

        String fileName = "/invoice.json";

        JsonNode jsonNode = JsonUtil.readData(fileName);

        JsonNode jsonNodes = jsonNode.get("items");
        System.out.println(jsonNodes);
        if(jsonNodes.isArray()){
            double quantity = 0;
            double totalPrice = 0;
            for(JsonNode jn:jsonNodes){
                quantity += jn.get("quantity").asDouble();
                totalPrice += jn.get("totalPrice").asDouble();
            }
            System.out.println("Total Quantity :"+quantity);
            System.out.println("Total Amount   :"+totalPrice);
            System.out.println("Average Price  :"+(totalPrice/quantity));
        }

        ObjectMapper objectMapper = new ObjectMapper();
        List<InvoiceItem> invoiceItems = objectMapper.convertValue(jsonNodes, new TypeReference<List<InvoiceItem>>() {
        });

        for(InvoiceItem invoiceItem:invoiceItems){
            System.out.println(invoiceItem);
        }


    }


}
