package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Pet("dog");

        Car car1 = new Diesel("heighten", "row", 902, 570.65);
        Car car2 = new Diesel("none", "home", 169, 69.93);

        Car car3 = new Electric("another", "because", 883, 673.42);
        Car car4 = new LPG("band", "pause", 241, 917.79);

        Human human1 = new Human(dog, 2000.0);
        human1.setCash(10000.0);
        Human human2 = new Human(dog, 3000.0);
        human2.setCash(15000.0);

        human1.setCar(car1, 0);
        human1.setCar(car2, 1);

        human2.setCar(car3, 0);
        human2.setCar(car4, 1);

        System.out.println(human1);
        System.out.println(human2);

        human1.getCar(1).sell(human1, human2, 1.0);


        System.out.println(Arrays.toString(human1.getGarage()));
        System.out.println(Arrays.toString(human2.getGarage()));

    }

}