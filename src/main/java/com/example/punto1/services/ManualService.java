package com.example.punto1.services;

public class ManualService {

    public ManualService() {
        System.out.println("CONSTRUCTOR ManualService (@Bean+@lazy) creado");
    }

    public void ejecutarExperimento() {
        System.out.println("MÉTODO experimento ejecutado desde @Bean");
    }
}