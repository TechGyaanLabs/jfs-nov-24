package com.careerit.cj.invoice;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsageData {

    private String accNo;
    private long quantity;
    private double price;
    private ChargeType chargeType;

}
