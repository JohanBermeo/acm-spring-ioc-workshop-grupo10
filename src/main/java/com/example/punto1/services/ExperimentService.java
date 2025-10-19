package com.example.punto1.services;

import org.springframework.stereotype.Component;
@Component("experimentComponent")
public class ExperimentService {

    public ExperimentService() {
        System.out.println("CONSTRUCTOR ExperimentService (@Component) creado");
    }

    public void ejecutarExperimento() {
        System.out.println("MÉTODO Experimento ejecutado desde @Component");
    }
}