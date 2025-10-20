package com.ADCUD.La_Conspiración_de_los_Qualifiers.runner;

import com.ADCUD.La_Conspiración_de_los_Qualifiers.service.OrderService;
import com.ADCUD.La_Conspiración_de_los_Qualifiers.service.OptionalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Launcher implements CommandLineRunner {

    private final OrderService orderService;
    private final OptionalService optionalService;

    public Launcher(OrderService orderService, OptionalService optionalService) {
        this.orderService = orderService;
        this.optionalService = optionalService;
    }

    @Override
    public void run(String... args) {
        orderService.processOrder();
        optionalService.checkService();
    }
}