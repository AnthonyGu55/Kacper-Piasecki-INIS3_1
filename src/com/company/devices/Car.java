package com.company.devices;

public class Car extends Device {

    private Double value;

    public Car(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return this.value;
    }

    @Override
    public void turnOn() {
        System.out.println("*VROOM*");
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}