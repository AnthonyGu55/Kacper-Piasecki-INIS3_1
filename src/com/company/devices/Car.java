package com.company.devices;

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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value=" + value +
                '}';
    }
}