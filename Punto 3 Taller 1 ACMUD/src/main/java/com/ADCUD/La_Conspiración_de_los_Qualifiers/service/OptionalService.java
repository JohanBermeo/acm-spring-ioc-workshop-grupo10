package com.ADCUD.La_Conspiración_de_los_Qualifiers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OptionalService {

    @Autowired(required = false)
    private DiscountService discountService;

    public void checkService() {
        if (discountService == null) {
            System.out.println("No hay DiscountService disponible en el contexto.");
        } else {
            System.out.println("Descuento disponible: " + (discountService.getDiscount() * 100) + "%");
        }
    }
}
