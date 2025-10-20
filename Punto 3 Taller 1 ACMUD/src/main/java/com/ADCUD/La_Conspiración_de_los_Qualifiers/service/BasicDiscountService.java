package com.ADCUD.La_Conspiración_de_los_Qualifiers.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BasicDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0.10; // 10%
    }
}