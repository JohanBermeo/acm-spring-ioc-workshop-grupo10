package com.example.punto1;

import com.example.punto1.services.ExperimentService;
import com.example.punto1.services.ManualService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
@SpringBootApplication
public class Punto1Application implements CommandLineRunner {

    private final ExperimentService componentBean;
    private final ManualService manualBean;

    public Punto1Application(
            @Qualifier("experimentComponent") ExperimentService componentBean,
            @Lazy@Qualifier("experimentBean") ManualService manualBean) {
        System.out.println("\n>>> Inyección por constructor COMPLETADA\n");
        this.componentBean = componentBean;
        this.manualBean = manualBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(Punto1Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("--- Usando beans ---\n");
        componentBean.ejecutarExperimento();
        manualBean.ejecutarExperimento();
        System.out.println("\n=== FIN ===");
    }
}