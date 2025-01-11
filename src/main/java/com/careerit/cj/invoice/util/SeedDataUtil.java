package com.careerit.cj.invoice.util;

import com.careerit.cj.invoice.domain.UsageData;
import com.careerit.cj.invoice.domain.Account;
import com.careerit.cj.invoice.domain.Discount;
import com.careerit.cj.invoice.enums.ChargeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SeedDataUtil {


    public static List<UsageData> getUsageData() {
        String[] accountNumbers = {"SB1001", "SB1002", "SB1003"};
        ChargeType[] chargeTypes = ChargeType.values();
        Random random = new Random();
        List<UsageData> usageDataList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            UsageData data = new UsageData();
            data.setAccNo(accountNumbers[random.nextInt(accountNumbers.length)]);
            data.setQuantity(50 + random.nextInt(150)); // Random quantity between 50 and 200
            data.setPrice(10 + random.nextDouble() * 90); // Random price between 10.0 and 100.0
            data.setChargeType(chargeTypes[random.nextInt(chargeTypes.length)]);
            usageDataList.add(data);
        }

        return usageDataList;
    }

    public static List<Discount> getDiscounts(){
        Discount d1 = new Discount();
        d1.setChargeType(ChargeType.DATA);
        d1.setDiscountPercentage(10);
        Discount d2 = new Discount();
        d2.setChargeType(ChargeType.DIGITAL_TV);
        d2.setDiscountPercentage(5);
        Discount d3 = new Discount();
        d3.setChargeType(ChargeType.VOICE_CALL);
        d3.setDiscountPercentage(15);
        return List.of(d1,d2,d3);
    }

    public static Map<String, Account> getAccountDetails(){
        return Map.of(
                "SB1001",new Account("SB1001","TCS","billing@tcs.com"),
                "SB1002",new Account("SB1002","Infosys","billing@infy.com"),
                "SB1003",new Account("SB1003","Wipro","billing@wipro.com")

                );
    }

}
