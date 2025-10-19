package com.example.punto1.config;

import com.example.punto1.services.ManualService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfig {

    @Bean("experimentBean")
    @Lazy
    public ManualService manualService() {
        System.out.println("(MÉTODO @Bean) Creando ManualService CON @Lazy");
        return new ManualService();
    }
}
