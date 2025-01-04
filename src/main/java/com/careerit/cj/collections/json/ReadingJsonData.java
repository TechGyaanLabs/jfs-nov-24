package com.careerit.cj.collections.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class ReadingJsonData {

    public static void main(String[] args) {

        String fileName = "/players.json";
        List<Player> players = JsonUtil.readListData(fileName, new TypeReference<List<Player>>() {});
        System.out.println(players.size());

        String empFileName = "/emp_data.json";
        List<Employee> employees = JsonUtil.readListData(empFileName, new TypeReference<List<Employee>>() {});
        System.out.println(employees.size());

        String invoiceFileName = "/invoice.json";

        JsonNode jsonNode = JsonUtil.readData(invoiceFileName);
        JsonNode buyerNode = jsonNode.get("buyer");
        System.out.println(buyerNode.get("contact").asText());

        Invoice invoice = JsonUtil.readData(invoiceFileName, new TypeReference<Invoice>() {});
        System.out.println(invoice);
    }
}
