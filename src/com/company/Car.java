package com.company;

public class Car {
    final private String model;
    final private String producer;
    private Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value =  value;
    }

    public Double getValue() {
        return this.value;
    }
}