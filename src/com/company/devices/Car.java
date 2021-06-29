package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {


    public Car(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);

    }

    @Override
    public void turnOn() {
        System.out.println("*VROOM*");
    }


    abstract void refuel();

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        boolean hasCar = false;
        int positionInGarage = 0;

        for (int i = 0; i < seller.getGarage().length; i++) {
            if (seller.getGarage()[i] == this) {
                hasCar = true;
                positionInGarage = i;
                break;
            }
        }

        if (!hasCar) {
            System.out.println("The seller doesn't have the car in their garage");
            throw new IllegalArgumentException();
        }

        boolean hasEmptySpace = false;
        int emptyPosition = 0;

        for (int i = 0; i < buyer.getGarage().length; i++) {
            if (buyer.getGarage()[i] == null) {
                hasEmptySpace = true;
                emptyPosition = i;
                break;
            }
        }

        if (!hasEmptySpace) {
            System.out.println("The buyer doesn't have any free space in their garage");
            throw new IllegalArgumentException();
        }

        if (buyer.getCash() < this.getValue()) {
            System.out.println("The buyer doesn't have enough cash");
            throw new IllegalArgumentException();
        }

        buyer.setCar(seller.getCar(positionInGarage), emptyPosition);
        seller.setCar(null, positionInGarage);

        seller.setCash(seller.getCash() + this.getValue());
        buyer.setCash(buyer.getCash() - this.getValue());

        System.out.println("Car sold successfully");

    }
}