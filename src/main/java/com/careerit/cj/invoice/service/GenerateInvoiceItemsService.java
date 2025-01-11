package com.careerit.cj.invoice.service;

import com.careerit.cj.invoice.domain.UsageData;
import com.careerit.cj.invoice.domain.Discount;
import com.careerit.cj.invoice.domain.InvoiceItems;
import com.careerit.cj.invoice.enums.ChargeType;
import com.careerit.cj.invoice.util.SeedDataUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateInvoiceItemsService {


    public Map<String, List<InvoiceItems>> getInvoiceItems() {
        List<UsageData> list = SeedDataUtil.getUsageData();
        List<Discount> discounts = SeedDataUtil.getDiscounts();
        Map<ChargeType, Double> discountMap = createDiscountMap(discounts);
        Map<String, List<UsageData>> accountUsageData =
                createAccountUsageData(list);

        Map<String, List<InvoiceItems>> invoiceItemsOfAccount = new HashMap<>();

        accountUsageData.forEach((accNo, usageDataList) -> {
            List<InvoiceItems> invoiceItems = usageDataList.stream()
                    .map(usageData -> createInvoiceItem(usageData, discountMap))
                    .collect(Collectors.toList());
            invoiceItemsOfAccount.put(accNo, invoiceItems);
        });
        return invoiceItemsOfAccount;
    }

    private InvoiceItems createInvoiceItem(UsageData usageData, Map<ChargeType, Double> discountMap) {
        InvoiceItems item = new InvoiceItems();
        item.setChargeType(usageData.getChargeType());
        item.setQuantity(usageData.getQuantity());
        item.setPrice(usageData.getPrice());
        double amount = usageData.getQuantity() * usageData.getPrice();
        double discountAmount = calculateDiscountAmount(usageData.getChargeType(), amount, discountMap);
        item.setDiscount(discountAmount);
        item.setAmount(amount);
        return item;
    }

    private static Map<String, List<UsageData>> createAccountUsageData(List<UsageData> list) {
        return list.stream()
                .collect(Collectors.groupingBy(UsageData::getAccNo));
    }

    private static Map<ChargeType,Double> createDiscountMap(List<Discount> discounts) {
        return discounts.stream()
                .collect(Collectors.toMap(Discount::getChargeType, Discount::getDiscountPercentage));
    }

    private double calculateDiscountAmount(ChargeType chargeType, double amount, Map<ChargeType, Double> discountMap) {
        return  discountMap.getOrDefault(chargeType, 0.0) * amount / 100;
    }
}
