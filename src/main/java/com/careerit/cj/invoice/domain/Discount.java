package com.careerit.cj.invoice.domain;

import com.careerit.cj.invoice.enums.ChargeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Discount {

    private ChargeType chargeType;
    private double discountPercentage;

}
