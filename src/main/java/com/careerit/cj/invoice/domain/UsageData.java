package com.careerit.cj.invoice.domain;

import com.careerit.cj.invoice.enums.ChargeType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UsageData {

    private String accNo;
    private long quantity;
    private double price;
    private ChargeType chargeType;

}
