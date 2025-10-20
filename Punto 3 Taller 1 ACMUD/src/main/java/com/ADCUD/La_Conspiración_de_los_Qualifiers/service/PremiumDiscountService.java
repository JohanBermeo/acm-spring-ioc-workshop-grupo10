package com.ADCUD.La_Conspiración_de_los_Qualifiers.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PremiumDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0.30; // 30%
    }
}