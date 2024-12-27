package com.careerit.cj.invoice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Discount {

    private ChargeType chargeType;
    private double discountPercentage;

}
