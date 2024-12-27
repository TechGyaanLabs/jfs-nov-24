package com.careerit.cj.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UsageDataService {


    public static List<UsageData> getUsageData() {
        String[] accountNumbers = {"SB1001", "SB1002", "SB1005"};
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


}
