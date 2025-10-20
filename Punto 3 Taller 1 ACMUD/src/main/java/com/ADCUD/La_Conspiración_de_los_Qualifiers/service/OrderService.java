package com.ADCUD.La_Conspiración_de_los_Qualifiers.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final DiscountService discountService;

    public OrderService(@Qualifier("basicDiscountService") DiscountService discountService) {
        this.discountService = discountService;
    }

    public void processOrder() {
        System.out.println("Aplicando descuento de: " + (discountService.getDiscount() * 100) + "%");
    }
}